package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyEtsy {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        /*
        NEW task;
        1. Go to google webstite
        2. save the title in a string variable
        3. go to Etsy
        4. save the Etst Title in a String
        5. Navigate back to previouse page
        6. Verify the title is same as step 2
        7. Navigate forward to previoud page
        8.Verify the title is same as step 4

         */
//step 1 go to google
        driver.get("HTTPS://www.google.com");

        //maximize window
        driver.manage().window().maximize();
        String GExpectedTitle="Google";

        Thread.sleep(3000);
        driver.navigate().to("https://www.etsy.com/");

        String etsyExpectedTitle="etsy-shop for handmade";
        driver.navigate().back();

        //step
        String actualGoogleTile=driver.getTitle();

        if(etsyExpectedTitle.equals(actualGoogleTile)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
            System.out.println("I expect"+ etsyExpectedTitle);
            System.out.println("actual result"+actualGoogleTile);
        }
        driver.navigate().forward();

        String etsyActualTitile = driver.getTitle();
        if(etsyExpectedTitle.equals(etsyActualTitile)){
            System.out.println("pass");
        }else {
            System.out.println("FAIL");
            System.out.println("I expected Title" + etsyExpectedTitle);
            System.out.println("The actual URL is: " + etsyActualTitile );
        }

        driver.close();





    }
}
