package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class taskVytrack {
    WebDriver driver;


    @Test
    public void VyTrack() throws InterruptedException {

        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://qa3.vytrack.com");
        WebElement username = driver.findElement(By.id("prependedInput"));
        username.sendKeys("salesmanager110");
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        password.submit();
        Thread.sleep(2000);
        //verify dashboard is open
        String expected="Dashboard";
        String actual=driver.getTitle();
        Thread.sleep(2000);
        Assert.assertEquals(actual,expected);
        //click on shortcut
        Thread.sleep(2000);
        WebElement shortcut=driver.findElement(By.className("fa-share-square"));
        shortcut.click();

//        //click on see full list
        Thread.sleep(2000);
        WebElement fullList=driver.findElement(By.linkText("See full list"));
        Thread.sleep(2000);
        fullList.click();

        //click on vehicle service logs
        Thread.sleep(2000);
        WebElement logs=driver.findElement(By.linkText("Vehicle Services Logs"));
        logs.click();

        //11.Verify error message text is You do not have
        //permission to perform this action.
        Thread.sleep(2000);
        WebElement error=driver.findElement(By.className("message"));
        error.click();

        Thread.sleep(2000);

        //verify Shortcut Actions List page is still open
        String expectedTitle="Shortcut Actions List";
        String actualTitle=driver.getTitle();
        Thread.sleep(2000);
       // Assert.assertTrue(driver.getTitle().contains("Shortcut Actions List page is still open"));
       Assert.assertEquals(actualTitle,expectedTitle); //failsssss
       // StringUtility.verifyEquals(actualTitle, expectedTitle); //requires class

        //driver.close();






    }
}


        /*
        Open browser
1.Go to Vytrack login page
2.Login as a sales manager
3.Verify Dashboard page is open
4.Click on Shortcuts icon
5.Click on link See full list
6.Click on link Opportunities
7.Verify Open opportunities page is open
8.Click on Shortcuts icon
9.Click on link See full list
10.Click on link Vehicle Service Logs
11.Verify error message text is You do not have
permission to perform this action.
13. Verify Shortcut Actions List page is still open
         */


