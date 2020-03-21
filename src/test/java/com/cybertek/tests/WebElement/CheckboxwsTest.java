package com.cybertek.tests.WebElement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxwsTest {
    WebDriver driver;
    private WebDriverFactory WebDriveFactory;

    @BeforeMethod
    public void beforeMethod(){
        driver= WebDriveFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");
    }
    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }
    @Test
    public void test(){
        //input[1]
        WebElement one=driver.findElement(By.xpath("//input[1]"));
        WebElement two=driver.findElement(By.xpath("//input[2]"));
        //by default one is not checked two is checked
        System.out.println("one "+one.isSelected());
        System.out.println("two "+two.isSelected());

        Assert.assertFalse(one.isSelected());
        Assert.assertFalse(two.isSelected());
        //check the first checkbox
        //verify one is selected
        //verify two is selected
        System.out.println("checked the first box");
        one.click();
        System.out.println("one "+one.isSelected());
        System.out.println("two "+two.isSelected());

        Assert.assertTrue(one.isSelected());
        Assert.assertTrue(two.isSelected());
//http://practice.cybertekschool.com/dynamic_controls

    }
}
