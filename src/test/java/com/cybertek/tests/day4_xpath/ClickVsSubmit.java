package com.cybertek.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickVsSubmit {
    public static void main(String[] args) {
        /*
         task:
        1. go to forgot password web page
        http://practice.cybertekschool.com/forgot_password
        2.  enter any email
        3. click "retrieve password" bttb
        4. verify the URL is:
        http://practice.cybertekschool.com/email_sent
**

         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        driver.manage().window().maximize();
        //locate email box
        WebElement email=driver.findElement(By.name("email"));
        //enter email
        email.sendKeys("g.iclal@gmail.com");
        /*
        click() each element can be click
        submit() if there is submit attribute, it is better
         */
        //locate button
        WebElement button=driver.findElement(By.id("form_submit"));
        //submit email
        button.submit();
        //verify--> expected(should be given manually) >>actual
        String expect="http://practice.cybertekschool.com/email_sent";
        String actual=driver.getCurrentUrl();
        if(expect.equals(actual)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }




    }
}
