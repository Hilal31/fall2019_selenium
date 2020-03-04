package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTitleVerify {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //go to etsy ---> data URL: http://www.etsy.com/
        driver.get("http://www.etsy.com/");

        //verify title
        //expected vs actual
        String expectedTitle="etsy=shop for handmade,vintage,custom, and unique gifts for everyone";

        String actualTitle = driver.getTitle();
        if(expectedTitle.equalsIgnoreCase(actualTitle)){
            System.out.println("The test is Pass");
        }else {
            System.out.println("The test is Failed");
            System.out.println(expectedTitle + " vs  " + actualTitle);
        }
        driver.close();

    }
}
