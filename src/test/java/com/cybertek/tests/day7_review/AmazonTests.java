package com.cybertek.tests.day7_review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTests {

        // main method to invoke the tests
        public static void main(String[] args) {
            nameMatchTest();

        }

        // each test will be a separate method

        /**
         * open browser
         * go to amazon
         * search for any item
         * remember the name of the first result
         * click on the first result
         * verify that product name is same in the product page
         */
        private static void nameMatchTest() {
            WebDriver driver= WebDriverFactory.getDriver("chrome");
            driver.get("https://www.amazon.com");

            String searchTerm="disinfectant wipes";
            WebElement searchInput=driver.findElement(By.id("twotabsearchtextbox"));
            //use to enter
            searchInput.sendKeys(searchTerm+ Keys.ENTER);
            //OR enter search term and click the search button
            searchInput.sendKeys(searchTerm);
            WebElement searchBtn=driver.findElement(new By.ByClassName("nav-input"));
            searchBtn.click();
            //when we cant find element id name class, use xPAth
            //formula //tag[@attribute='value']
            WebElement firstResult=driver.findElement(By.xpath("//span[@class='a-size-base-plus.a-color-base.a-text-normal']"));
            System.out.println(firstResult.getText());
            driver.quit();



        }


    }

