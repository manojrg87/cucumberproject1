package org.example;

import org.Pages.com.Page1;
import org.Pages.com.Page2;
import org.Pages.com.Page3;
import org.browser.com.Browser;

public class Main {
    public static void main(String[] args) throws InterruptedException
    {
        Browser.Initialization();
        Browser.Setup("https://www.smartbazaar.co.uk/");
        Thread.sleep(2000);

        System.out.println(Page1.Title());
        Page1.searchData("flowers");
        //Thread.sleep(1000);
        Page1.clickOn();
        Thread.sleep(2000);

        System.out.println(Page2.SearchText());
        Page2.productselection("ARALI/KANER FLOWERS – RED/PINK (100G)");
        Thread.sleep(2000);

        System.out.println(Page3.verify());
        Browser.Close();
    }

}