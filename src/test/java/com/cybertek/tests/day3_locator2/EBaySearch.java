package com.cybertek.tests.day3_locator2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBaySearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.ebay.com/");
        //we cant use attributes if they have spaces.because locater cant find them
        //we can locate by finding id or name

        WebElement search=driver.findElement(By.name("_nkw"));
        search.sendKeys("shoes"+ Keys.ENTER);//to use enter on the keyboard
        WebElement searchButton=driver.findElement(By.name("gh-btn"));
        searchButton.click();
        //verify title contains search item
        String expectedT="shoes";
        String actual=driver.getTitle();
        if(actual.contains(expectedT)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

    }
}
