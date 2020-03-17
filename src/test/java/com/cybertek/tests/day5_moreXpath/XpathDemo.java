package com.cybertek.tests.day5_moreXpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathDemo {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons\n");
//        driver.manage().window().maximize();
//
        WebElement button1=driver.findElement(By.xpath("//button[@onclick='button1()']"));
        String btn1=button1.getText();
        System.out.println(btn1);

        WebElement button2=driver.findElement(By.xpath("//h3/following sibling::button[2]"));
        // sibling formula: //E2/following sibling::E2
        System.out.println(button2.getText());
        WebElement button3=driver.findElement(By.xpath("//button[@onclick='button3()'"));
        System.out.println(button3.getText());
//        WebElement button4=driver.findElement(By.xpath(""));



    }
}
