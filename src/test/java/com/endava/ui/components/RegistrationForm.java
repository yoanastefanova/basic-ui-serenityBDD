package com.endava.ui.components;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

import static com.endava.ui.locators.WebElements.Login.HOME_REGISTER_BUTTON;
import static com.endava.ui.locators.WebElements.Login.LOGGED_IN_BUTTON;
import static com.endava.ui.locators.WebElements.Register.*;

public class RegistrationForm extends PageObject {

    @Step("Open the home page")
    public void openHomePage() {
        this.open();
    }

    @Step("Click on the homepage Register button")
    public void clickHomepageRegisterButton() {
        $(HOME_REGISTER_BUTTON).click();
    }

    @Step("Check Mrs.")
    public void checkMrs() {
        $(MRS_RADIO_BUTTON).click();
    }


    @Step("Enter firstname")
    public void enterFirstname(String firstname) {
        $(FIRSTNAME_FIELD).type(firstname);
    }


    @Step("Enter sirname")
    public void enterSirname(String sirname) {
        $(SIRNAME_FIELD).type(sirname);
    }


    @Step("Enter email")
    public void enterEmail(String email) {
        $(EMAIL_FIELD).type(email);
    }

    @Step("Enter registration password")
    public void enterRegistrationPassword(String password) {
        $(REGISTRATION_PASSWORD_FIELD).type(password);
    }

    @Step("Enter country")
    public void enterCountry(String country) {
        $(COUNTRY_FIELD).type(country);
    }

    @Step("Enter city")
    public void enterCity(String city) {
        $(CITY_FIELD).type(city);
    }

    @Step("Check agreement checkbox")
    public void checkAgreementCheckbox() {
        $(AGREEMENT_CHECKBOX).click();
    }


    @Step("Click on Register button")
    public void clickRegisterButton() {
        $(REGISTER_BUTTON).click();
    }



}
