package com.cybertek.tests.day3_locator2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().maximize();
        //I want to get the value of type attribute
        //type="text" getAttribute("attribute name")
        /*
        getAttribute
        you provide attribute name as String Driver will give you the value of the attribute;
        to use this method;
        1-locate element first
        2-then with that element use getAttribute()method


         */

        //locate username box
        WebElement username=driver.findElement(By.name("username"));

        /*
        input type="text" name="username"
        above element has 2 elements,

         */
        String valueType= username.getAttribute("type");
        System.out.println(valueType);

        //button class="btn btn-primary" type="submit" id="wooden_spoon">Login</
        WebElement login=driver.findElement(By.id("wooden_spoon"));
        //I want to print class attribute
        System.out.println(login.getAttribute("class"));
        //getText vs getAttribute???

    }
}
