package com.cybertek.tests.day9_testing_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class taskVytrack {
    public static void main(String[] args) {
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
12.permission to perform this action.
13. Verify Shortcut Actions List page is still open
         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://qa3.vytrack.com");
        WebElement username = driver.findElement(By.id("prependedInput"));
        username.sendKeys("salesmanager110");
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        password.submit();
    }
}
