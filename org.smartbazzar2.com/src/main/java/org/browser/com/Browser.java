package org.browser.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class Browser {
    public static WebDriver driver;

    /* Initialization is to open the browser */
    public static WebDriver Initialization()
    {

        try
        {
            String Browserchoice = Browser.fileProperties("browser");
            if(Browserchoice.equalsIgnoreCase("chrome"))
            {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (Browserchoice.equalsIgnoreCase("safari"))
            {
                WebDriverManager.safaridriver().setup();
                driver=new SafariDriver();
            }else
            {
                System.out.println("Wrong data");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return driver;
    }

    /* To open the Url */
    public static void Setup(String url) {

        try {
            driver.get(url);
            driver.manage().window().maximize();
            Thread.sleep(2000);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    /* To close the browser */
    public static void Close() {

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.quit();

    }


    public static String fileProperties(String propertiesData) //browser
    {
        String returnData = null;
        try {
            String filelocation = System.getProperty("user.dir") + "//src//main//resources//Configuration//Configure.properties";
            File file = new File(filelocation);
            FileInputStream fileinput = new FileInputStream(file);
            Properties prop = new Properties();
            prop.load(fileinput);
            returnData = prop.getProperty(propertiesData); //browser
        }catch(Exception e)
        {
            System.out.println("Properties" + e);
        }
        return returnData;
    }
}

