package office_hours.oh_3;

import com.cybertek.base.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class EtsyTest extends TestBase {
    /*
    search wooden spoon on etsy
    verify default to location is ship to
    verify ship to count Australia
     */

    @Test
    public void verifyCountryList(){
        driver.get("https://etsy.com");
        WebElement input=driver.findElement(By.id("global-enhancements-search-query"));
        input.sendKeys("wooden spoon"+ Keys.ENTER);

        //verify title contains searchterm
        String expectedtitle="Wooden spoon | Etsy";
        //wait a little until title changes to right one
       // driver.manage().timeouts().implicitlyWait();doesnt work----
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleIs(expectedtitle));
        //verify title
        Assert.assertEquals(driver.getTitle(),expectedtitle);

        //wait until element is found in html
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // verify ship to location
        Select shipTo=new Select(driver.findElement(By.name("ship_to")));
        //verify the default
        String expectedDefaultCountry= "United States";
        String actualDefault=shipTo.getFirstSelectedOption().getText().trim();
        Assert.assertEquals(actualDefault,expectedDefaultCountry);

        //verify ship to countries
        Assert.assertTrue(shipTo.getOptions().contains("Australia"));
        //ArrayList<String>list= (ArrayList<String>) Arrays.asList("1","2");
        List<String> options=BrowserUtils.getElementsText(shipTo.getOptions());
        Assert.assertTrue(options.contains("Australia"));

        //verify free shipping is not clicked
        WebElement freeShipping=driver.findElement(By.name("free_shipping"));
        Assert.assertFalse(freeShipping.isSelected());

        //verify url changes when free shipping is clicked
        freeShipping.click();
        //click using java script
        //JavascriptExecutor executor=(JavascriptExecutor)
        WebElement freeShippingLabel=driver.findElement(By.xpath("//label"));




    }


}
