package com.cybertek.tests.WebElement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElementsTests {
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
    /*
    go to page radio button
    verify that none of the sports radio butttons selected
     */
    @Test
    public void listOfRadioButtons() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        //driver.findElements returns a list of element
        //if we enter anything after name, it returns empty list, no exception
        Thread.sleep(10000);
        List<WebElement> sport=driver.findElements(By.name("sport"));
        System.out.println(sport.size());
        for (WebElement radioButton:sport
             ) {
            Assert.assertFalse(radioButton.isSelected());

        }
    }
}
