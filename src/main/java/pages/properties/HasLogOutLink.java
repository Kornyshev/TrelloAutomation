package pages.properties;

import pages.LogOutIntermediatePage;
import tools.WaitHelper;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public interface HasLogOutLink {

    String logOutLinkXpath = "//nav//span[contains(text(), 'Log out')]";

    default LogOutIntermediatePage clickLogOutLink() {
        $x(logOutLinkXpath).shouldBe(visible).click();
        WaitHelper.waitForDocumentReadyState();
        return new LogOutIntermediatePage();
    }
}