package com.cybertek.tests.day3_locator2;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {
    public static void main(String[] args) {
       WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
        /*
        1-go to login page http://practice.cybertekschool.com/login
        2-ent invalid username
        3-ent invalid name
        4-verify error msg"your username is invalid"
         */
        Faker fake=new Faker();
        String username=fake.name().fullName();
        String password=fake.app().author();

        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("wooden_spoon")).click();

    }
}
