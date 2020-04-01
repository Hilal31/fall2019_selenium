package com.cybertek.base;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {
    protected WebDriver driver;
    @BeforeMethod
    public void setUpTest(){
        driver= WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(5000);
        //     driver.quit();
    }
}
