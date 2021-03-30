package pages;

import pages.properties.HasLanguagePicker;
import pages.properties.HasMainHeader;
import pages.properties.HasSocialNetworkLogin;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

public class SignUpPage implements HasMainHeader, HasLanguagePicker, HasSocialNetworkLogin {

    private final String emailFieldXPath = "";
    private final String continueButtonXPath = "";
    private final String logInLinkXPath = "";
}