package pages;

import pages.properties.HasLogOutLink;
import pages.properties.HasProfileIconInHeader;
import tools.WaitHelper;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MainLoggedInPage implements HasProfileIconInHeader, HasLogOutLink {

    private final String mainHeaderCss = "div.all-boards h2";

    public String getMainHeaderText() {
        WaitHelper.waitForDocumentReadyState();
        return $(mainHeaderCss).shouldBe(visible).getText();
    }
}