package com.cybertek.tests.day4_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XpathPractice {
    public static void main(String[] args) {
        //go to login page
        //locate username box with absolute xpath
        //locate username box with relative xpath
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/login\n");
        driver.manage().window().maximize();
        ///html/body/div/div[2]/div/div/form/div[1]/div/input
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div/div/input")).sendKeys("iclal guven");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("passwordxxx");

    }
}
