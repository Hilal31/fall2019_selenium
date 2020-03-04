package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    public static void main(String[] args) {
        /*
       test case1:Login successfully

        1-go to Vytrack login page
        2-write username data :storemanager52
        3-write password "UserUser123"
        4-click login button

        test cases2:
        login invalid credential
        1-go to login page
        2-write invalid user name
        3-enter invalid password
        4-Click login button
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vytrack.com/user/login");
        driver.manage().window().maximize();

        driver.findElement(By.id("prependedInput")).sendKeys("storemanager52");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");

        //find login button and then click
        WebElement login=driver.findElement(By.id("_submit"));
        login.click();

        //login button can be found and clicked directly
        //verify that you are in the homepage
        String expectedURL="https://app.vytrack.com/"; //String expectedTitle="Dashboard"
        String actualURL=driver.getCurrentUrl();  //String actualTitle=driver.getTitle()
;

        if(actualURL.equals(expectedURL)){
            System.out.println("home page");
        }else{
            System.out.println("outside");
            System.out.println("expectedURL "+expectedURL);
            System.out.println("actualURL "+actualURL);



    }
}}
