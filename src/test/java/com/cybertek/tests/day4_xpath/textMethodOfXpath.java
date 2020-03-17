package com.cybertek.tests.day4_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class textMethodOfXpath {
    public static void main(String[] args) {
        /*
        go to http://practice.cybertekschool.com/context_menu
        verify Context menu in on the page
         */
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/context_menu");
        driver.manage().window().maximize();
        WebElement text=driver.findElement(By.xpath("//h3[text()='Context Menu']"));

        String expectedContext="Context Menu";
        String actualContext=text.getText();
        if(expectedContext.equals(actualContext)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }



    }
}
