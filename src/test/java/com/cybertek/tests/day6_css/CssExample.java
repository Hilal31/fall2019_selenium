package com.cybertek.tests.day6_css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssExample {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement button=driver.findElement(By.cssSelector("#disappearing_button"));
        System.out.println(button.getText());
         /*
        Css locator,is another locator in selenium
        Id--
        xpath: //*[disappearing_button']
        Css: #disappearing_button >>in Css # means id
        #id--find element by id
        tag#id--find tag using id

        Class--
        .nav-link-->any element that has class nav-link
        . means class,put one dot for each class and no space
          */
        WebElement button1=driver.findElement(By.cssSelector("h4.col4"));//tag name and class or tag#id
        System.out.println(button.getText());

    }
}
