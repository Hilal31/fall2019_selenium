package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);
        //save title in string
        String title="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actual= driver.getTitle();
        if(title.equals(actual)){
            System.out.println("right");
        }else{
            System.out.println("turn back");
        }

        //go to clothing section
//        driver.navigate().to("https://www.amazon.com/gp/browse.html?node=7147440011&ref_=nav_em_T1_0_4_12_2__sft_women");
//        String clothTitle="Women's Clothing, Shoes, Jewelry, Watches & Handbags | Amazon.com";
//        driver.navigate().back();
//        Thread.sleep(2000);
//        //get title
//        String actually=driver.getTitle();
//
//        if(title.equals(actually)){
//            System.out.println("right");
//        }else{
//            System.out.println("turn back");
//        }


       // driver.quit();
        Thread.sleep(2000);

        driver.navigate().to("https://www.apple.com/");
        String tit="Apple";//Apple
        String real=driver.getTitle();
        if(tit.equals(real)){
            System.out.println("right");
        }else{
            System.out.println("turn back");
        }

        driver.navigate().to("https://www.apple.com/");
        String apple="https://www.apple.com/";
        String appURL=driver.getCurrentUrl();

        if(apple.equals(appURL)){
            System.out.println("right URL");
        }else{
            System.out.println("turn back to URL");
        }

        driver.quit();


    }
}
