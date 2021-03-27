package steps;

import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.Assertions.assertThat;

public class CommonSteps {

    private static final MainPage mainPage = new MainPage();
    private static final String BASIC_URL = "https://trello.com/";

    @Given("I open Trello Main Page")
    public void i_open_Trello_Main_Page() {
        mainPage.login(BASIC_URL);
    }

    @When("print Source code of current page")
    public void print_source_code() {
        System.out.println(WebDriverRunner.getWebDriver().getPageSource());
    }

    @Then("page title should be {string}")
    public void page_title_should_be(String string) {
        assertThat(title()).isEqualTo(string);
    }

    @Then("header in Hero Section on Main Page has correct text {string}")
    public void headerInHeroSectionOnMainPageHasCorrectTextText(String string) {
        assertThat(mainPage.getTextOfHeaderInHeroSection()).isEqualTo(string);
    }
}