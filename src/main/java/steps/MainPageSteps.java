package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import pages.MainPage;

import static org.assertj.core.api.Assertions.*;

public class MainPageSteps {

    private static final MainPage mainPage = new MainPage();

    @When("type {string} in E-Mail field in Hero section on Main Page")
    public void typeTextInEMailFieldInHeroSectionOnMainPage(String string) {
        mainPage.sendTextInEmailHeroSectionField(string);
    }

    @When("click on Sigh-Up button in Hero section on Main Page")
    public void clickOnSighUpButtonInHeroSectionOnMainPage() {
        mainPage.clickSubmitButtonHeroSection();
    }

    @When("click on Log In button in Header on Main Page")
    public void clickOnLogInButtonInHeaderOnMainPage() {
        mainPage.clickOnHeaderLogInButton();
    }

    @When("click on Sigh-Up button in Header on Main Page")
    public void clickOnSighUpButtonInHeaderOnMainPage() {
        mainPage.clickOnHeaderSignUpButton();
    }

    @When("type {string} in E-Mail field in Sign-Up section on Main Page")
    public void typeIncorrect_textInEMailFieldInSignUpSectionOnMainPage(String string) {
        mainPage.sendTextInEmailSignUpSectionField(string);
    }

    @When("click on Sigh-Up button in Sign-Up section on Main Page")
    public void clickOnSighUpButtonInSignUpSectionOnMainPage() {
        mainPage.clickSubmitButtonSignUpSection();
    }

    @When("choose {string} in Language dropdown on Main Page")
    public void chooseLanguageInLanguageDropdownOnMainPage(String string) {
        mainPage.selectLanguageInPicker(string);
    }

    @Then("Language picker has correct value {string}")
    public void languagePickerHasCorrectValueLanguage(String string) {
        assertThat(mainPage.selectedOptionInLanguagePicker()).isEqualTo(string);
    }
}