package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LogInPage;

import static org.assertj.core.api.Assertions.assertThat;

public class LogInPageSteps {

    private final LogInPage logInPage = new LogInPage();

    @Then("Log In page have correct {string} in Main Header")
    public void logInPageHaveCorrectTextInMainHeader(String string) {
        assertThat(logInPage.getMainHeaderText()).isEqualTo(string);
    }

    @When("choose {string} in Language dropdown on Log In Page")
    public void chooseEnglishInLanguageDropdownOnLogInPage(String string) {
        logInPage.selectLanguageInPicker(string);
    }
}