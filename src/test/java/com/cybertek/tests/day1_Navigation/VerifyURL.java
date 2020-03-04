package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.etsy.com/");
        String expectedURL="https://www.etsy.com/";
        String actualURL=driver.getCurrentUrl();

        if(expectedURL.equals(actualURL)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
            System.out.println("I expect"+ expectedURL);
            System.out.println("actual result"+actualURL);
        }
//task 2
        driver.get("https://www.etsy.com/");
        String expectedURL2="https://www.etsy.com/c/clothing-and-shoes?ref=catnav-10923";
        String actualURL2=driver.getCurrentUrl();

        if(expectedURL2.equals(actualURL2)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
            System.out.println("I expect"+ expectedURL);
            System.out.println("actual result"+actualURL);
        }
        driver.close();



    }
}
