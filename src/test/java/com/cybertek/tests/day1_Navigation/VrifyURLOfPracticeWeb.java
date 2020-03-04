package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VrifyURLOfPracticeWeb {
    public static void main(String[] args) {
        /*
        1- go to cybertek practice website
        http://practice.cybertekschool.com/
        2- verify URL
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");
        String expectedURL="http://practice.cybertekschool.com/";
        String actualURL=driver.getCurrentUrl();

        if(expectedURL.equals(actualURL)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
            System.out.println("I expect"+ expectedURL);
            System.out.println("actual result"+actualURL);
        }
        driver.close();

    }
}
