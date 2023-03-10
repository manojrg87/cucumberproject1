package org.Pages.com;

import org.PageObject.com.PageObj3;

import java.time.Duration;

import static org.browser.com.Browser.driver;

public class Page3 {
    static PageObj3 think;

    public static String verify(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        think=new PageObj3();
        return  think.check().getText();

        // return  driver.findElement(By.xpath(" //*[@class= 'product_title entry-title']")).getText();

    }
}
