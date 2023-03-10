package Stepdefinition;

import io.cucumber.java.en.*;
import org.Pages.com.Page1;
import org.browser.com.Browser;
import org.screenshot.com.Screenshot;
import org.testng.Assert;
import org.testng.Reporter;

public class Test1 {
    @Given("User opens the browser")
    public void user_opens_the_browser() {
        Browser.Initialization();
    }
    @Then("User enters the {string}")
    public void user_enters_the(String string) {
        Browser.Setup(string);
    }
    @And("User verifies the title of the application")
    public void user_verifies_the_title_of_the_application() {
        try
        {
            Thread.sleep(2000);
            Screenshot.ScreenShot1("title");
            Assert.assertEquals("Smartbazaar – World of Asian Foods", Page1.Title());
            Reporter.log("Pass");
        }catch (AssertionError | Exception e)
        {
            System.out.println(e);
            Reporter.log(e.getMessage());
            Reporter.log("Fail");
        }

    }
    @Then("User close the browser")
    public void user_close_the_browser() {
        Browser.Close();

    }

}
