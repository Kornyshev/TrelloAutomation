package tools;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

    private WaitHelper() {}

    private static final String DOCUMENT_IS_READY = "return document.readyState == 'complete'";

    public static boolean isDisplayedWithTime(SelenideElement element, long timeMilliseconds) {
        while(timeMilliseconds > 0) {
            if(element.isDisplayed()) {
                return true;
            }
            Selenide.sleep(100);
            timeMilliseconds -= 100;
        }
        return false;
    }

    private static JavascriptExecutor getJsExecutor() {
        return (JavascriptExecutor) WebDriverRunner.getWebDriver();
    }

    public static void waitForDocumentReadyState() {
        new WebDriverWait(WebDriverRunner.getWebDriver(), 60)
                .until(webDriver -> Boolean.valueOf(getJsExecutor().executeScript(DOCUMENT_IS_READY).toString()));
    }
}