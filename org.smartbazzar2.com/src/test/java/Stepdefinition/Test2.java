package Stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Pages.com.Page1;
import org.Pages.com.Page2;
import org.Pages.com.Page3;
import org.screenshot.com.Screenshot;
import org.testng.Assert;

public class Test2 {
    @And("User enters the {string} data in the search bar")
    public void user_enters_the_data_in_the_search_bar(String string) {

            Page1.searchData(string);


    }
    @When("User clicks on the search icon")
    public void user_clicks_on_the_search_icon()  {
        try
        {
            Page1.clickOn();
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
    @And("User verifies the {string} results")
    public void user_verifies_the_results(String string) {
        try
        {
            Thread.sleep(3000);
            Screenshot.ScreenShot1(string);
            Assert.assertEquals(string, Page2.SearchText());
        }
        catch (AssertionError | Exception e)
        {
            System.out.println(e);
        }
    }
    @Then("User selects the {string} from the list")
    public void user_selects_the_from_the_list(String string) {
        Page2.productselection(string);
    }
    @Then("User verifies the {string} result")
    public void user_verifies_the_result(String string) {
        try
        {
            Screenshot.ScreenShot1(string);
            Assert.assertEquals(string, Page3.verify());
        }catch (AssertionError | Exception e)
        {
            System.out.println(e);
        }
    }

}
