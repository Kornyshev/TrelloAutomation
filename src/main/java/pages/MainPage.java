package pages;

import pages.properties.HasLanguagePicker;
import pages.properties.HasMainHeader;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage extends BasePage implements HasMainHeader, HasLanguagePicker {

    private final String logInHeaderButtonXPath = "//header//a[contains(@href, 'login')]";
    private final String signUpHeaderButtonXPath = "//header//a[contains(@href, 'signup')]";

    private final String topHeroSectionXPath = "//section[@id='hero']";
    private final String emailFieldInTopSectionXPath = topHeroSectionXPath + "//input";
    private final String signUpButtonInTopSectionXPath = topHeroSectionXPath + "//button[@type='submit']";

    private final String signUpSectionXPath = "//section[@id='sign-up']";
    private final String emailFieldInSignUpSectionXPath = signUpSectionXPath + "//input";
    private final String signUpButtonInSignUpSectionXPath = signUpSectionXPath + "//button[@type='submit']";

    private final String startDoingSignUpButtonXPath = "//a[contains(text(), ''Start doing)]";

    public void clickOnHeaderLogInButton() {
        $x(logInHeaderButtonXPath).shouldBe(visible).scrollTo().click();
    }

    public void clickOnHeaderSignUpButton() {
        $x(signUpHeaderButtonXPath).shouldBe(visible).scrollTo().click();
    }

    public MainPage clickOnStartDoingButton() {
        $x(startDoingSignUpButtonXPath).shouldBe(visible)
                .scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}").click();
        return this;
    }

    public void sendTextInEmailHeroSectionField(String text) {
        $x(emailFieldInTopSectionXPath)
                .shouldBe(visible)
                .scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}")
                .sendKeys(text);
    }

    public void clickSubmitButtonHeroSection() {
        $x(signUpButtonInTopSectionXPath)
                .shouldBe(visible)
                .scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}")
                .click();
    }

    public void sendTextInEmailSignUpSectionField(String text) {
        $x(emailFieldInSignUpSectionXPath)
                .shouldBe(visible)
                .scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}")
                .sendKeys(text);
    }

    public void clickSubmitButtonSignUpSection() {
        $x(signUpButtonInSignUpSectionXPath)
                .shouldBe(visible)
                .scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}")
                .click();
    }
}