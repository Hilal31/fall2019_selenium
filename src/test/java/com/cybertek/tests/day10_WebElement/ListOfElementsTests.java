package com.cybertek.tests.day10_WebElement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElementsTests {
    WebDriver driver;
    private WebDriverFactory WebDriveFactory;

    @BeforeMethod
    public void beforeMethod(){
        driver= WebDriveFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");
    }
//    @AfterMethod
//    public void afterMethod() {
//        driver.quit();
//    }
    /*
    go to page radio button
    verify that none of the sports radio butttons selected
     */
    @Test
    public void listOfRadioButtons() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        //driver.findElements returns a list of element
        //if we enter anything after name, it returns empty list, no exception
        Thread.sleep(10000);
        List<WebElement> sport=driver.findElements(By.name("sport"));
        System.out.println(sport.size());
        for (WebElement radioButton:sport) {
            Assert.assertFalse(radioButton.isSelected());

        }
    }
    @Test
    public void getAllLinks(){
        driver.get("http://practice.cybertekschool.com");

        //get all the links in a page
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        //get the text of each link and print
        for (WebElement link:links)
            System.out.println(link.getText());{

        }

    }
    /*
    go to amazon
    search for lysol cleaner
    print the number of results
    print the first, second result
    print the last result
     */
    @Test
    public void amazonTest(){
        driver.get("https://amazon.com");
        WebElement input=driver.findElement(By.id("twotabsearchtextbox"));
        input.sendKeys("paper towels"+ Keys.ENTER);

        List<WebElement> allResults=driver.findElements(By.cssSelector("span.a-size-base-plus"));
        System.out.println("results: "+allResults.size());
        System.out.println("first result: "+allResults.get(0).getText());
        System.out.println("last result: "+allResults.get(allResults.size()-1).getText());

    }
    @Test
    public void checkButton(){
         /*
        go to http://practice.cybertekschool.com/radio_buttons
        verify the all sports checkboxes are NOT checked by default
randomly click any sport
verify that that sport is clicked
verify that all others are not clicked
repeat the last step for 5 times
         */

        driver.get("http://practice.cybertekschool.com/radio_buttons");
        List<WebElement>allSports=driver.findElements(By.className("sport"));
        for (WebElement sport:allSports) {
           // Assert.assertFalse();
        }

    }
}
