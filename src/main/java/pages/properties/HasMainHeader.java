package pages.properties;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public interface HasMainHeader {

    String mainHeaderXPath = "//h1";

    default String getMainHeaderText() {
        return $x(mainHeaderXPath).shouldBe(visible).getText();
    }
}