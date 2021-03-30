package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignUpPage;

import static org.assertj.core.api.Assertions.assertThat;

public class SignUpPageSteps {

    private final SignUpPage signUpPage = new SignUpPage();

    @Then("Sign Up page have correct {string} in Main Header")
    public void signUpPageHaveCorrectSignUpForYourAccountInMainHeader(String string) {
        assertThat(signUpPage.getMainHeaderText()).isEqualTo(string);
    }

    @When("choose {string} in Language dropdown on Sign Up Page")
    public void chooseEnglishInLanguageDropdownOnSignUpPage(String string) {
        signUpPage.selectLanguageInPicker(string);
    }
}