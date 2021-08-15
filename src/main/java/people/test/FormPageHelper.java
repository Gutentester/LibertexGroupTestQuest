package people.test;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class FormPageHelper {

    public void GoToPage (String url) {
        open(url);
    }

    public void InputText (String value) {
        $(By.name("q")).setValue(value);
    }
    public void PressEnter () {
        $(By.name("q")).pressEnter();
    }
    public void CheckText (String value) {
        $(byText(value)).shouldBe(visible);
    }
    public void CheckFIO (String value) {
        $("div[class*='liYKde g VjDLd']").find(value);
    }
    public void HowerToInput () {
        $(By.name("q")).hover();
    }
    public void CheckHint (String value) {
        $("input[title*='Поиск']").shouldBe(visible);
    }
    public void ClickOnGoogleLogo () {
        $("div[class*='logo']").click();
    }
    public void CheckIsEmptySearchList () {
        $("div[class*='L3eUgb']").shouldNotHave(text("Результатов"));
    }
}
