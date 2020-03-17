package com.cybertek.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
        /*
        go to forgot pw page
        enter any email
        click retrieve button
        verify "your email s been sent
         */
        WebElement email=driver.findElement(By.name("email"));
        //enter email
        email.sendKeys("g.iclal@gmail.com");
        //locate button
        WebElement button=driver.findElement(By.id("form_submit"));
        //submit email
        button.submit();
        //verify
        String expectedText="Your e-mail's been sent!";
        WebElement message=driver.findElement(By.name("confirmation_message"));
        //gettext
        String actualT=message.getText();
        if(expectedText.equals(actualT)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }
}
