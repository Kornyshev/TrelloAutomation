package pages;

import pages.properties.HasLanguagePicker;
import pages.properties.HasMainHeader;
import pages.properties.HasSocialNetworkLogin;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

public class SignUpPage implements HasMainHeader, HasLanguagePicker, HasSocialNetworkLogin {

    private final String emailFieldXPath = "//form/input[@type='email']";
    private final String continueButtonXPath = "//input[@id='signup-submit']";
    private final String logInLinkXPath = "//a[@data-analytics-link='signUpLoginLink']";

    public LogInPage clickLogInLink() {
        $x(logInLinkXPath)
                .shouldBe(visible)
                .scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}")
                .click();
        return new LogInPage();
    }
}