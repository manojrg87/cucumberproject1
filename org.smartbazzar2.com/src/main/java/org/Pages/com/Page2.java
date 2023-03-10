package org.Pages.com;

import org.PageObject.com.PageObj2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Page2 {
    static PageObj2 trail;

    public static String SearchText()
    {
        trail=new PageObj2();
        return trail.searchItems().getText();
        //return driver.findElement(By.xpath("//*[@id=\"content\"]/nav")).getText();
    }

    public static void productselection (String product)
    {
        try {
            Thread.sleep(3000);
            List<WebElement> list = trail.itemSelection().findElements(By.xpath(".//li/div/div/div[3]/div/h4/a"));

            //List<WebElement>list=driver.findElements(By.xpath("//*[@id=\"main\"]/div[2]/ul/li/div/div/div[3]/div/h4/a"));
            for (WebElement ele : list) {
                //System.out.println(ele.getText());
                String name = ele.getText();
                if (name.contains(product)) {
                    ele.click();
                    Thread.sleep(2000);
                    break;
                }
            }
        }catch(Exception e){

            System.out.println(e);

        }
        // driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[6]/div/div/div[1]/a/img")).click();
    }
}


