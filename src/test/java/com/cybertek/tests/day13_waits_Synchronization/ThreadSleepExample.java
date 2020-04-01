package com.cybertek.tests.day13_waits_Synchronization;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThreadSleepExample {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
    @Test
    public void tets1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");
        Thread.sleep(7000);
        WebElement msg=driver.findElement(By.cssSelector("#finish>h4"));
        Assert.assertTrue(msg.isDisplayed());
        System.out.println(msg.getText());

    }
}
