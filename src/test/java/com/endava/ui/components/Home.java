package com.endava.ui.components;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

import static com.endava.ui.locators.WebElements.Login.*;

public class Home extends PageObject {

    @Step("Open the home page")
    public void openHomePage() {
        this.open();
    }


    @Step("Enter username")
    public void enterUsername(String username) {
        $(USERNAME_FIELD).type(username);
    }

    @Step("Enter password")
    public void enterPassword(String password) {
        $(PASSWORD_FIELD).type(password);
    }

    @Step("Click on LogIn button")
    public void clickLogInButton() {
        $(LOGIN_BUTTON).click();
    }

    @Step("I see Welcome message")
    public boolean iSeeWelcomeMessage() {
        return $(LOGGED_IN_BUTTON).isDisplayed();
    }


    @Step("Click on Register button")
    public void clickRegisterButton() {
        $(HOME_REGISTER_BUTTON).click();
    }

}
