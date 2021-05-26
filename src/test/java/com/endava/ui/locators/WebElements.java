package com.endava.ui.locators;

import org.openqa.selenium.By;

public class WebElements {

    public static class Login {
        public static By USERNAME_FIELD = By.cssSelector("input[name='email']");
        public static By PASSWORD_FIELD = By.cssSelector("input[name='pass']");
        public static By LOGIN_BUTTON = By.cssSelector("button[name='btn-login']");
        public static By LOGGED_IN_BUTTON = By.cssSelector("div#navbar a[role='button']");
        public static By HOME_REGISTER_BUTTON = By.cssSelector("a[name='btn-login']");
    }


    //register

    public static class Register {

        public static By MRS_RADIO_BUTTON = By.cssSelector("label:nth-of-type(2) > input[name='title']");
        public static By FIRSTNAME_FIELD = By.cssSelector("input[name='first_name']");
        public static By SIRNAME_FIELD = By.cssSelector("input[name='sir_name']");
        public static By EMAIL_FIELD = By.cssSelector("input[name='email']");
        public static By REGISTRATION_PASSWORD_FIELD = By.cssSelector("input[name='pass']");
        public static By COUNTRY_FIELD = By.cssSelector("input[name='country']");
        public static By CITY_FIELD = By.cssSelector("input#city");
        public static By AGREEMENT_CHECKBOX = By.cssSelector("input#TOS");
        public static By REGISTER_BUTTON = By.cssSelector("button#reg");
    }

}
