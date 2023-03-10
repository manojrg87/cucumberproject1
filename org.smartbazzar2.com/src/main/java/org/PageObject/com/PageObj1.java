package org.PageObject.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.browser.com.Browser.driver;

public class PageObj1 {
    public PageObj1()
    {
        PageFactory.initElements(driver,this);
    }

    //driver.findElement(By.xpath("//input[@name='s']"))-NOT WORKING
    //driver.findElement(By.xpath("//input[@name='s' and @ placeholder=\"Search\"]")).sendKeys(product);
    @FindBy(xpath = "//input[@name='s' and @ placeholder=\"Search\"]")
    WebElement searchBar;
    public WebElement searchBox()
    {
        return searchBar;
    }

    //driver.findElement(By.xpath("//div[@class='search']/div/form//div[2]/span"))
    @FindBy(xpath = "//div[@class='search']/div/form//div[2]/span")
    WebElement clickBar;
    public WebElement clickIcon()
    {
        return clickBar;
    }

}
