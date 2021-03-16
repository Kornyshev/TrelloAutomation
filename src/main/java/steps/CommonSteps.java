package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;

import static com.codeborne.selenide.Selenide.*;

public class CommonSteps {

    public static final String BASIC_URL = "https://trello.com/";

    @Given("I open Trello Main Page")
    public void i_open_Trello_Main_Page() {
        open(BASIC_URL);
    }

    @Then("page title should be {string}")
    public void page_title_should_be(String string) {
        Assertions.assertThat(title()).isEqualTo(string);
    }
}