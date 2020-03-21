package com.cybertek.tests.WebElement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonTest {
    WebDriver driver;
    private WebDriverFactory WebDriveFactory;

    @BeforeMethod
    public void beforeMethod(){
        driver= WebDriveFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
    }
    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }
    /*
    go to http://practice.cybertekschool.com/
    verify that blue is selected
    red is not selected
     */
    @Test
    public void test1(){
        WebElement blue = driver.findElement(By.id("blue"));
        //isSelected --> returns true if element is selected
        // System.out.println(blue.isSelected());
        //verify is the radio button is selected
        Assert.assertTrue(blue.isSelected());
        Assert.assertTrue(blue.isSelected());


    }
    @Test
    public void test2(){
        WebElement red=driver.findElement(By.id("red"));
        WebElement blue=driver.findElement(By.id("blue"));
        red.click();

    }
}
