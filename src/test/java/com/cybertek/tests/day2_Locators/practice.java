package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.zara.com/us/en/logon");
        driver.findElement(By.className("form-input-label__input form-input-text__input")).sendKeys("g.iclal91@gmail.com");
        driver.findElement(By.id("form-input-label")).sendKeys("Iclalguven1");

    }
}
