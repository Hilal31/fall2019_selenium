package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Locators1 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        driver= WebDriverFactory.getDriver("chrome");

    }
    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }
    @Test
    public void amazon(){
        driver.get("https://www.amazon.com/");
        WebElement searchButton=driver.findElement(By.id("twotabsearchtextbox"));
        searchButton.sendKeys("wooden spoon"+ Keys.ENTER);
        String title=driver.getTitle();
        Assert.assertEquals(title,"wooden Spoon");
        /*
        String expected="Wooden Spoon"
        String actual=title
         */

    }
    @Test
    public void wikipedia(){
        driver.get("https://www.wikipedia.org/");
        //enter search term selenium webdriver
        WebElement searchButtn=driver.findElement(By.id("searchInput"));
        searchButtn.sendKeys("selenium webdriver");
        searchButtn.submit();
        //click on search result selenium
        WebElement selenium=driver.findElement(By.xpath("//a[@title='Selenium (software)']"));
        selenium.click();
        //verify url endswith selenium_(software)
        String getUrl=driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        String newUrl = getUrl.substring(30);
        System.out.println(newUrl);
        Assert.assertEquals(newUrl,"Selenium_(software)");



    }
}
