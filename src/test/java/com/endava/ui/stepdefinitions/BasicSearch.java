package com.endava.ui.stepdefinitions;

import com.endava.ui.components.Home;
import com.endava.utils.TextMatcher;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

import static junit.framework.TestCase.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

public class BasicSearch {

    @Steps
    Home home;

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setUpDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @Given("I go to the SuT home page")
    public void iGoToTheSuTHomePage() {
        home.openHomePage();
    }

    @When("I enter username {string}")
    public void iEnterUsername(String arg0) {
        home.enterUsername(arg0);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String arg1) {
        home.enterPassword(arg1);
    }

    @And("I click on the LogIn button")
    public void iClickOnTheLogInButton() {
        home.clickLogInButton();
    }

    @Then("I should see that I am successfully logged in")
    public void iShouldSeeThatIAmSuccessfullyLoggedIn() {
        assertTrue(home.iSeeWelcomeMessage());
    }
}
