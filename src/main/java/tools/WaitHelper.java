package tools;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class WaitHelper {

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
}