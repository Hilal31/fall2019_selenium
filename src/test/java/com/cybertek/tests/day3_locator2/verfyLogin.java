package com.cybertek.tests.day3_locator2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verfyLogin {
    public static void main(String[] args) {
        /*
        go to login page
        enter username
        enter password
        click login button
        verify the welcome message "welcome  to the secure area, when you are done
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword"+ Keys.ENTER);
        driver.findElement(By.id("wooden_spoon")).click();

        /*
        ***********Interview Q********
        how do you locate when there is no attributes of an element??or if the element has only text msg?
        answer
        * locating welcome msg with tagname <h4
        * or text itself

         */
        WebElement welcomeMsg=driver.findElement(By.tagName("h4"));
        //<h4 class="subheader">Welcome to the Secure Area. When you are done click logout below.</h4>
        String expectmsg="Welcome to the Secure Area. When you are done click logout below.";
        //String vs WebElement
        //getText>>convert webElement to String
        String actualWelcome=welcomeMsg.getText();
        if(expectmsg.equalsIgnoreCase(actualWelcome)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        driver.close();


    }
}
