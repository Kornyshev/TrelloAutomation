package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainLoggedInPage;

import static org.assertj.core.api.Assertions.assertThat;

public class MainLoggedInPageSteps {

    private final MainLoggedInPage mainLoggedInPage = new MainLoggedInPage();

    @Then("Main Logged In page has text {string} in Main Header")
    public void mainHeaderOnMainLoggedPage(String string) {
        assertThat(mainLoggedInPage.getMainHeaderText()).isEqualTo(string);
    }

    @When("log out from current profile")
    public void logOut() {
        mainLoggedInPage.clickAccountIconXPath();
        mainLoggedInPage.clickLogOutLink().clickLogOutButton();
    }
}