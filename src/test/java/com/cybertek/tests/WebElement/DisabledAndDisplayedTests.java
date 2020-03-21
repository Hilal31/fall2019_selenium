package com.cybertek.tests.WebElement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DisabledAndDisplayedTests {
    WebDriver driver;
    private WebDriverFactory WebDriveFactory;

    @BeforeMethod
    public void beforeMethod(){
        driver= WebDriveFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");
    }
    @AfterMethod
    public void afterMethod() {
        driver.quit();

    }
    @Test
    public void disabledTest(){
        WebElement green=driver.findElement(By.id("green"));
        WebElement black=driver.findElement(By.id("black"));

        //isEnabled--returns true if the element is enabled

        System.out.println(green.isEnabled());
        System.out.println(black.isDisplayed());
    }

}
