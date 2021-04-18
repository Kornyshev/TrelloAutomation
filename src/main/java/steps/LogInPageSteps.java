package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.UserCredentials;
import pages.LogInPage;

import static org.assertj.core.api.Assertions.assertThat;
import static tools.PropertiesReader.getUserCredentials;

public class LogInPageSteps {

    private final LogInPage logInPage = new LogInPage();

    @Then("Log In page has text {string} in Main Header")
    public void logInPageHaveCorrectTextInMainHeader(String string) {
        assertThat(logInPage.getMainHeaderText()).isEqualTo(string);
    }

    @When("choose {string} in Language dropdown on Log In Page")
    public void chooseEnglishInLanguageDropdownOnLogInPage(String string) {
        logInPage.selectLanguageInPicker(string);
    }

    @When("user types E-Mail in Log In form on Log In page")
    public void typeEmailInLogInForm() {
        logInPage.sendEmail(getUserCredentials().getEmail());
    }

    @When("user types Password in Log In form on Log In page")
    public void typePasswordInLogInForm() {
        logInPage.sendPass(getUserCredentials().getPass());
    }

    @When("user clicks Log In with Atlassian button on Log In page")
    public void clickLogInWithAtlassianButton() {
        logInPage.clickLogInWithAtlassianButton();
    }

    @When("user clicks Last blue Log In button on Log In page")
    public void clickBlueLogInButton() {
        logInPage.clickLastBlueLogInButton();
    }

    @When("user clicks Sign Up link on Log In page")
    public void clickSignUpLink() {
        logInPage.clickSignUpLink();
    }
}