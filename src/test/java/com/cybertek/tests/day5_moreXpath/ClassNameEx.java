package com.cybertek.tests.day5_moreXpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassNameEx {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/login\n");

        WebElement link=driver.findElement(By.className("nav-link"));
        System.out.println(link.getText());
        // class name does not work if the value of the class attribute has a space
//        WebElement loginBtn = driver.findElement(By.className("btn btn-primary"));
//        loginBtn.click();

//http://practice.cybertekschool.com/dynamic_loading
        WebElement Ltext=driver.findElement(By.linkText(""));

        WebElement ex2=driver.findElement(By.partialLinkText(""));
        System.out.println(ex2.getText());
    }
}
