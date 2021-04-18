package pages.properties;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

public interface HasProfileIconInHeader {

    String accountIconXPath = "//div[@id='header']//button[@aria-label='Open member menu']";

    default void clickAccountIconXPath() {
        $x(accountIconXPath).shouldBe(visible).click();
    }
}