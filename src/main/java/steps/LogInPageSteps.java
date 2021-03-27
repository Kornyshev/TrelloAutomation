package steps;

import io.cucumber.java.en.Then;
import pages.LogInPage;

import static org.assertj.core.api.Assertions.assertThat;

public class LogInPageSteps {

    private final LogInPage logInPage = new LogInPage();

    @Then("Log In page have correct {string} in Main Header")
    public void logInPageHaveCorrectTextInMainHeader(String string) {
        assertThat(logInPage.getMainHeaderText()).isEqualTo(string);
    }
}