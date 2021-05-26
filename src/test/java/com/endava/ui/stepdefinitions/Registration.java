package com.endava.ui.stepdefinitions;

import com.endava.ui.components.Home;
import com.endava.ui.components.RegistrationForm;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class Registration {

    @Steps
    Home home;
    RegistrationForm registrationForm;

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setUpDriver() {
        WebDriverManager.chromedriver().setup();
    }

//    @Given("I go to the SuT home page")
//    public void iGoToTheSuTHomePage() {
//        home.openHomePage();
//    }

    @When("I click on the homepage Register button")
    public void iClickOnTheHomepageRegisterButton() {
        home.clickRegisterButton();
    }

    @And("I check Mrs.")
    public void iCheckMrs() {
        registrationForm.checkMrs();
    }

    @And("I enter First name {string}")
    public void iEnterFirstName(String arg0) {
        registrationForm.enterFirstname(arg0);
    }

    @And("I enter Sir name {string}")
    public void iEnterSirName(String arg0) {
        registrationForm.enterSirname(arg0);
    }

    @And("I enter email {string}")
    public void iEnterEmail(String arg0) {
        registrationForm.enterEmail(arg0);
    }

    @And("I enter registration password {string}")
    public void iEnterRegistrationPassword(String arg0) {
        registrationForm.enterRegistrationPassword(arg0);
    }

    @And("I enter country {string}")
    public void iEnterCountry(String arg0) {
        registrationForm.enterCountry(arg0);
    }

    @And("I enter city {string}")
    public void iEnterCity(String arg0) {
        registrationForm.enterCity(arg0);
    }

    @And("I check the agreement checkbox")
    public void iCheckTheCheckbox() {
        registrationForm.checkAgreementCheckbox();
    }

    @And("I click on the Register button")
    public void iClickOnTheRegisterButton() {
        registrationForm.clickRegisterButton();
    }

    @Then("I should see that I am successfully registered and logged in")
    public void iShouldSeeThatIAmSuccessfullyRegisteredAndLoggedIn() {
        home.iSeeWelcomeMessage();
    }


}
