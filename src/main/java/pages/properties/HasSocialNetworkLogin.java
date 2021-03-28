package pages.properties;

import tools.WaitHelper;

import static com.codeborne.selenide.Selenide.$x;

public interface HasSocialNetworkLogin {

    String googleLogInButtonXPath = "//span[@id='google-icon']/..";
    String microsoftLogInButtonXPath = "//span[@id='msft-icon']/..";
    String appleLogInButtonXPath = "//span[@id='apple-icon']/..";

    default boolean isGoogleLoginButtonDisplayed() {
        return WaitHelper.isDisplayedWithTime($x(googleLogInButtonXPath), 1000);
    }

    default boolean isMicrosoftLoginButtonDisplayed() {
        return WaitHelper.isDisplayedWithTime($x(microsoftLogInButtonXPath), 1000);
    }

    default boolean isAppleLoginButtonDisplayed() {
        return WaitHelper.isDisplayedWithTime($x(appleLogInButtonXPath), 1000);
    }
}