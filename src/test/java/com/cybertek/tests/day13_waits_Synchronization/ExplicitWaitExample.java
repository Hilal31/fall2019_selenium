package com.cybertek.tests.day13_waits_Synchronization;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class ExplicitWaitExample {
    WebDriver driver;
    //create obj
    WebDriverWait wait;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        wait=new WebDriverWait(driver,10);
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test
    public void test1Title() {
        driver.get("https://google.com/");
        System.out.println(driver.getTitle());
        driver.get("https://store.steampowered.com/");

        //wait for the title of the second page
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.titleContains("Steam"));
        System.out.println(driver.getTitle());
        wait.until(ExpectedConditions.titleContains("Steam"));
        System.out.println(driver.getTitle());


    }
    @Test
    public void test2visible(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
       // WebElement
        WebElement buton=driver.findElement(By.tagName("button"));
        buton.click();
        WebElement username=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id("pwd"));

        //give not enough time
        wait.withTimeout(Duration.ofSeconds(2));

        //wait for given element to be visible on page
        wait.until(ExpectedConditions.visibilityOf(username));

        //make sure that username is visible on page
        Assert.assertTrue(username.isDisplayed());
        username.sendKeys("johndoe");

    }
    @Test
    public void testWaitForClickable(){
        WebElement username=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id("pwd"));
        WebElement submit=driver.findElement(By.tagName("Button"));

        Assert.assertTrue(username.isDisplayed());
        username.sendKeys("Admiral Kunkka");
        password.sendKeys("Admiral Kunkka");
        //wait for element disappear
        //wait until the overlay element disappears
        WebElement overlay=driver.findElement(By.className("loadingoverlay"));
        wait.until(ExpectedConditions.invisibilityOf(overlay));

        //wait for given element to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(submit));
        submit.click();

    }
    @Test
    public void TestInvisible(){
        driver.manage().window().maximize();
        driver.get("http://qa3.vytrack.com");
        WebElement username = driver.findElement(By.id("prependedInput"));
        username.sendKeys("salesmanager110");
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        password.submit();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement myCalender=driver.findElement(By.linkText("My calender"));
        //wait until element with class loader mask is not visible
        /*
        WebElement overlay=driver.findElement(By.cssSelector(".loader-mask"));
        wait.until(ExpectedConditions.invisibilityOf(overlay));
        we can make it short:
         */
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader-mask")));

        myCalender.click();
    }
    @Test
    public void test5Fluent(){

        driver.get("http://practice.cybertekschool.com/dynamic_loading/6");

        Wait<WebDriver> fluentWait = new FluentWait<>(driver).
                withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofSeconds(5)).
                ignoring(NoSuchElementException.class).
                ignoring(ElementClickInterceptedException.class);


        WebElement submitBtn = fluentWait.until(driver -> driver.findElement(By.xpath("//button[text()='Submit']")));

        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");

        submitBtn.click();

    }
}
