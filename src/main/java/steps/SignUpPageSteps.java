package steps;

import io.cucumber.java.en.Then;
import pages.SignUpPage;

import static org.assertj.core.api.Assertions.assertThat;

public class SignUpPageSteps {

    private final SignUpPage signUpPage = new SignUpPage();

    @Then("Sign Up page have correct {string} in Main Header")
    public void signUpPageHaveCorrectSignUpForYourAccountInMainHeader(String string) {
        assertThat(signUpPage.getMainHeaderText()).isEqualTo(string);
    }
}