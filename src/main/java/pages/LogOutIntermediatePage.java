package pages;

import tools.WaitHelper;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class LogOutIntermediatePage {

    private final String logOutBlueButtonXPath = "//form/button[@id='logout-submit']";

    public void clickLogOutButton() {
        $x(logOutBlueButtonXPath)
                .shouldBe(visible)
                .scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}")
                .click();
        WaitHelper.waitForDocumentReadyState();
    }
}