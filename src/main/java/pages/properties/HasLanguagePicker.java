package pages.properties;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public interface HasLanguagePicker {

    String languageSelectorXPath = "//select[@name='language-picker']";

    default void selectLanguageInPicker(String lang) {
        $x(languageSelectorXPath).shouldBe(visible).scrollTo().selectOption(lang);
    }

    default String selectedOptionInLanguagePicker() {
        return $x(languageSelectorXPath).getSelectedText();
    }
}