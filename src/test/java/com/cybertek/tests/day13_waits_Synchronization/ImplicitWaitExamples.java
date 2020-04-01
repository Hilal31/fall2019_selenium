package com.cybertek.tests.day13_waits_Synchronization;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitExamples {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void teardown() {
        driver.quit();
    }
    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);


        WebElement message = driver.findElement(By.cssSelector("#finish>h4"));

        Assert.assertTrue(message.isDisplayed());
        System.out.println(message.getText());

        driver.get("http://practice.cybertekschool.com/dynamic_loading/2");
        WebElement message2 = driver.findElement(By.cssSelector("#finish>h2"));

        Assert.assertTrue(message.isDisplayed());
        System.out.println(message2.getText());

    }


    }

