package com.cybertek.tests.WebElement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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

        System.out.println("green "+green.isEnabled());
        System.out.println("black "+black.isEnabled());

        Assert.assertFalse(green.isEnabled());
        Assert.assertFalse(black.isEnabled());


    }
    @Test
    public void Test(){
        WebElement green=driver.findElement(By.id("green"));
        WebElement black=driver.findElement(By.id("black"));

        //isEnabled--returns true if the element is enabled

        System.out.println("green "+green.getAttribute("disabled"));
        System.out.println("black "+black.getAttribute("disabled"));
        //verify that value of black.getAttribute('disabled') is null
        Assert.assertEquals(black.getAttribute("disabled"),"true");
        Assert.assertNull(black.getAttribute("disabled"));

        Assert.assertEquals(green.getAttribute("disabled"),"true");
        Assert.assertTrue(Boolean.parseBoolean(green.getAttribute("disabled")));

    }
    @Test
    public void testElementVisible() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        WebElement userName=driver.findElement(By.id("username"));
        WebElement start=driver.findElement(By.tagName("button"));

        //verify that username is not visible
        //isDisplayed returns true Element we found in HTML is visible on page
        System.out.println("username: "+ userName.isDisplayed());
        Assert.assertTrue(userName.isDisplayed());
        System.out.println("click on the start");

        start.click();

        Thread.sleep(7000);
        System.out.println("username is visible: "+userName.isDisplayed());
        Assert.assertTrue(userName.isDisplayed());
    }

}
