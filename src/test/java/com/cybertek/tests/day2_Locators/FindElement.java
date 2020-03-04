package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) throws InterruptedException {

        //locator 1. ID
        //go to cybertek okta login page>>>write email to the text box
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://cybertekschool.okta.com/");

        //write email to the text box
        /*
        1-find text box first-findElement() from WebDriver
         */
        Thread.sleep(3000);
        //String word="java";
        WebElement emailBox= driver.findElement(By.id("okta-signin-username"));//returns WebElement not string
        emailBox.sendKeys("g.iclal91@gmail.com");

        // find password
        driver.findElement(By.id("okta-signin-password")).sendKeys("Iclalguven1");



    }
}
