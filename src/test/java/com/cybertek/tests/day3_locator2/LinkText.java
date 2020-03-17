package com.cybertek.tests.day3_locator2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
    public static void main(String[] args) {
        //locator-->Linktext
        //ID,name,tagname, class, linkText
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        driver.manage().window().maximize();

        WebElement ex3=driver.findElement(By.linkText("http://practice.cybertekschool.com/dynamic_loading"));

        String textVersion=ex3.getText();
        System.out.println(textVersion);
        /*
        1st step
        go to page,
        2nd
        assign a new variable > FindElement(By.LinkText();
        3rd
        use the first variable and getText by assigning new variable
        4th
        print


         */

        //linkedText vs partialLinkedText

        WebElement example3= driver.findElement(By.partialLinkText("Example 3:"));
        String text=example3.getText();
        System.out.println(text);
        /*

         */





    }
}
