package com.cybertek.tests.day11_select_actions;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectClassTests {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @AfterMethod
    public void afterMethod(){
        //driver.quit();
    }

    @Test
    public void getSelectObj(){
        //find the element that has select tag
        WebElement dropdown=driver.findElement(By.id("dropdown"));
        //create a select class using the web element
        Select dropdownList=new Select(dropdown);
        //get the selected option
        WebElement selectedOption=dropdownList.getFirstSelectedOption();


    }

}
