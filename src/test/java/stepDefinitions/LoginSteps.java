package stepDefinitions;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;
import io.cucumber.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import pageObject.LoginPage;
import utilities.Driver;

/**
 * Unit test for simple App.
 */

@RunWith(Cucumber.class)
public class LoginSteps {

    WebDriver driver = Driver.getDriver();
    LoginPage lp;
//    Navigate to http://demo.automationtesting.in/Register.html
//    Locate the element for ‘firstname’
//    Pass your first name using sendkeys method
//    Remove each letter of your first name using Keys.BACK_SPACE
//    Leave the initial letter of your first name
//    Note: You can use Thread.sleep() each time you remove a letter
//    You can also try it with loopcan also try it with loop

    @Given("User launches {string}")
    public void user_launches(String string) {
      lp = new LoginPage();
      driver.get(string);
      



    }

    @When("User enters Username {string}")
    public void user_enters_Username(String string) {
        lp.setHomePageUserName(string);
    }

    @When("User enters password as {string}")
    public void user_enters_password_as(String string) {
        lp.setHomePagePass(string);
    }

    @When("User clicks on Login button")
    public void user_clicks_on_Login_button() {
       lp.LoginButton();
    }

    @Then("Get the Title of Page and Close")
    public void get_the_Title_of_Page_and_Close() {
        System.out.println(driver.getTitle());
        driver.quit();
    }

}
