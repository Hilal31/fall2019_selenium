package com.cybertek.tests.day15_webtables;

import com.cybertek.base.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablesTest extends TestBase {

    @BeforeMethod
    public void setUp() {
        String url = ConfigurationReader.getProperty("url");
        driver.get(url);
        driver.findElement(By.linkText("Sortable Data Tables")).click();
    }


    @Test
    public void printTable() {

        WebElement myTable = driver.findElement(By.id("table1"));
        System.out.println(myTable.getText());
    }

    @Test
    public void getHeaders() {
        //get all headers in a single element
        WebElement header = driver.findElement(By.id("thead"));
        System.out.println(header.getText());

        //get all headers in a list
        List<WebElement> headerss = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println(headerss.size());

        //it is nit element, it is list. to use it as a string, we need browser utils
        System.out.println(BrowserUtils.getElementsText(headerss));

    }

    @Test
    public void getTableSize() {
        //get table size

        List<WebElement> headerss = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println(headerss.size());
        //get number of rows including header
        List<WebElement> headerRows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        System.out.println("number of rows " + headerRows.size());

        //and without header
        List<WebElement> headerNo = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println("without header " + headerNo.size());
    }

    @Test
    public void getSingleton() {
        //get the first row step 1
        WebElement row = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]"));
        System.out.println(row.getText());

        //get the first row in the body step 3
        String xpath = getTableRowXpath(3);
        row = driver.findElement(By.xpath(xpath));
        System.out.println(row.getText());

    }

    //get table row xpath based on index step 2
    public static String getTableRowXpath(int index) {
        String xpath = "//table[@id='table1']/tbody/tr[" + index + "]";
        return xpath;
    }

    //get single cell based on index
    @Test
    public void getSingleCell() {
        WebElement cell = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td[1]"));
        System.out.println(cell.getText());

        String xpath = getCellByIndex(2, 3);
        cell = driver.findElement(By.xpath(xpath));
        System.out.println(cell.getText());
    }

    public static String getCellByIndex(int row, int column) {
        String xpath = "//table[@id='table1']/tbody/tr[" + row + "]/td[" + column + "]";
        return xpath;
    }

    //go through the table using loops and get all values
    @Test
    public void iterateTableLoop() {
        //get the number of rows
        int rowCount = getRowCount();

        //get the number of cols
        int colCount = getColCount();

        for (int i = 0; i <= rowCount; i++) {
            for (int j = 0; j <= colCount; j++) {
                String xpath = getCellByIndex(i, j);
                WebElement cell = driver.findElement(By.xpath(xpath));
                System.out.println(cell.getText());

            }
        }

    }

    //return number of rows excluding the table headers
    public int getRowCount() {
        return driver.findElements(By.xpath("table[@id='table1']/tbody/tr")).size();

    }

    //return number of rows
    public int getColCount() {
        return driver.findElements(By.xpath("table[@id='table1']//th")).size();


    }
}
