package pages;

import pages.properties.HasLanguagePicker;
import pages.properties.HasMainHeader;
import pages.properties.HasSocialNetworkLogin;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class LogInPage implements HasMainHeader, HasLanguagePicker, HasSocialNetworkLogin {

    private final String emailFieldXPath = "//div[@class='email-password']//input[@id='user']";
    private final String passFieldXPath = "//form//input[@id='password']";
    private final String logInButtonXPath = "//div[@class='email-password']/input[@type='submit']";
    private final String logInWithAtlassianButtonXPath = "//input[@value='Log in with Atlassian']";
    private final String lastBlueLogInButtonXPath = "//button[@id='login-submit']";
    private final String signUpForAnAccountLinkXPath = "//a[@class='signupLink']";

    public LogInPage sendEmail(String email) {
        $x(emailFieldXPath)
                .shouldBe(visible)
                .scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}")
                .sendKeys(email);
        return this;
    }

    public LogInPage sendPass(String pass) {
        $x(passFieldXPath)
                .shouldBe(visible)
                .scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}")
                .sendKeys(pass);
        return this;
    }

    public LogInPage clickLastBlueLogInButton() {
        $x(lastBlueLogInButtonXPath)
                .shouldBe(visible)
                .scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}")
                .click();
        return this;
    }

    public LogInPage clickLogInWithAtlassianButton() {
        $x(logInWithAtlassianButtonXPath)
                .shouldBe(visible)
                .scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}")
                .click();
        return this;
    }

    public SignUpPage clickSignUpLink() {
        $x(signUpForAnAccountLinkXPath)
                .shouldBe(visible)
                .scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}")
                .click();
        return new SignUpPage();
    }
}