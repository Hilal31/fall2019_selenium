package com.cybertek.tests.day12_pops_tabs_alerts_iframes;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframesExample {


    public class IframeExample {


        WebDriver driver;

        @BeforeMethod
        public void beforeMethod() {
            driver = WebDriverFactory.getDriver("chrome");
        }

        @AfterMethod
        public void afterTest() {
//        driver.quit();
        }

        @Test
        public void test() throws InterruptedException {
            driver.get("http://practice.cybertekschool.com/tinymce");

        }}}

