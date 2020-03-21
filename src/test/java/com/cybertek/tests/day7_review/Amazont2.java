package com.cybertek.tests.day7_review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazont2 {
    public static void main(String[] args) throws InterruptedException {
        nameMatch();
    }

    private static void nameMatch() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://amazon.com");

        String searcTerm="disinfectant wipes";
        WebElement searchInput=driver.findElement(By.id("twotabsearchtextbox"));
        //enter search term on the search box and press enter
        searchInput.sendKeys(searcTerm+ Keys.ENTER);

        WebElement searchButton=driver.findElement(By.className("nav-input"));
        searchButton.click();

        //searchInput.submit();
        //when there is an exception first check element and then add sleep to give time browser to open browser
        Thread.sleep(2000);
        WebElement firstRsult=driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        System.out.println(firstRsult.getText());
        String expected=firstRsult.getText();
        firstRsult.click();

        WebElement proName=driver.findElement(By.id("productTitle"));
        String actualN=proName.getText();
        System.out.println(actualN);

        if(expected.equals(actualN)){
            System.out.println("pass");
        }else{
            System.out.println("failed");
        }





    }
}
