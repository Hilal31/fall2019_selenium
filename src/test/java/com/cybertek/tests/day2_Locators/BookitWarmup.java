package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookitWarmup {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
/*
Task 1:
        1. Go to Bookit login page
        https://cybertek-reservation-qa.herokuapp.com/sign-in
        2. Verify the title of the page
        Task 2:
        2. Go to Bookit login page
        https://cybertek-reservation-qa.herokuapp.com/sign-in
        2. Verify that URL contains “cybertek-reservation”
 */


        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
        driver.manage().window().maximize();


        //expected and actual
        String expected="bookit";
        String actual=driver.getTitle();
        if(expected.equals(actual)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
            System.out.println("expected "+expected);
            System.out.println("actual "+actual);

        }
        driver.close();


        //task2
        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
        driver.manage().window().maximize();

        String expectedURL="cybertek-reservation";
        String actualURL=driver.getCurrentUrl();//https://cybertek-reservation-qa.herokuapp.com/sign-in

        if(actualURL.contains("cybertek-reservation")){
            System.out.println("verify URL");
        }else{
            System.out.println("fail");
            System.out.println("expectedURL "+expectedURL);
            System.out.println("actualURL "+actualURL);

        }
        driver.quit();
    }
}
