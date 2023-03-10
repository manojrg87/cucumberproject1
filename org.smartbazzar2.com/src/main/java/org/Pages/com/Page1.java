package org.Pages.com;

import org.PageObject.com.PageObj1;

import java.time.Duration;

import static org.browser.com.Browser.driver;

public class Page1 {
    static PageObj1 Practice;//pageobject1 class objectname
    public static String Title()
    {
        return driver.getTitle();
    }
    public static void searchData(String product)
    {
        Practice = new PageObj1();//creating new object
        Practice.searchBox().sendKeys(product);
        //driver.findElement(By.xpath("//input[@name='s' and @ placeholder=\"Search\"]")).sendKeys(product);
    }
    public static void clickOn()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Practice.clickIcon().click();
        //driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div[1]/div[3]/div/div/div[2]/div[1]/form/div[2]/span")).click();
    }


}
