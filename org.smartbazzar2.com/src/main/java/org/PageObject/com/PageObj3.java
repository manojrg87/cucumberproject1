package org.PageObject.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.browser.com.Browser.driver;

public class PageObj3 {
    public PageObj3()
    {
        PageFactory.initElements(driver,this);
    }
    //driver.findElement(By.xpath(" //*[@class= 'product_title entry-title']")).getText();
    @FindBy(xpath="//*[@class= 'product_title entry-title']")
    WebElement checking;
    public WebElement check()
    {
        return checking;
    }


}
