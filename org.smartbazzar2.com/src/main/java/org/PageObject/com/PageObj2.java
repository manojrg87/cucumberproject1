package org.PageObject.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.browser.com.Browser.driver;

public class PageObj2 {
    public PageObj2()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@id='content']/nav")
    WebElement itemSearch;
    public WebElement searchItems()
    {
        return itemSearch;
    }
    @FindBy(xpath = "//ul[@class='products columns-5']")
    WebElement selectItems;
    public WebElement itemSelection()
    {
        return selectItems;
    }
}
