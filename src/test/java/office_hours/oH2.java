package office_hours;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class oH2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        1-go to http://automationpractice.com
        2-Search for 'tshirt' in a searchbox+click enter or click search button
        3-validate you got 'no results' message on UI
        4-Search for 'thirt'
        5-validate there was 1 result found

         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://automationpractice.com");
        //webelement,is a class, and has many useful methods
        //sendKeys, value that we want to send -input
        WebElement search=driver.findElement(By.id("search_query_top"));
        search.sendKeys("tshirt"+ Keys.ENTER);
        /*
        <p class="alert alert-warning">
					No results were found for your search&nbsp;"tshirt"
			</p>
         */
        Thread.sleep(2000);
        WebElement error=driver.findElement(By.xpath("//p[@class='alert alert-warning"));
        String errorText=error.getText();
        //getText()>>returns String from the element
        System.out.println("error msg "+errorText);
       // https://www.seleniumhq.org/exceptions/no_such_element.html>>>means we could not locate element

        search.sendKeys("t-shirt"+Keys.ENTER);
        //StaleElementReferenceException-element is old/stale-we want to find
        //this element again or refresh page
    }
}
