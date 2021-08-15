package people.test;

import org.junit.jupiter.api.Test;

public class AutoTest {

    FormPageHelper formPageHelper = new FormPageHelper();

    @Test
    public void googleSearchOfTitleTest () {
        formPageHelper.GoToPage("https://www.google.ru/");
        formPageHelper.InputText("Погода");
        formPageHelper.PressEnter();
        formPageHelper.CheckText("Температура");
    }

    @Test
    public void googleSearchFIOTest () {
        formPageHelper.GoToPage("https://www.google.ru/");
        formPageHelper.InputText("Гагарин Юрий Алексеевич");
        formPageHelper.PressEnter();
        formPageHelper.CheckFIO("Юрий Алексеевич Гагарин");
    }
    @Test
    public void googleSearchHintVisibleTest () {
        formPageHelper.GoToPage("https://www.google.ru/");
        formPageHelper.HowerToInput();
        formPageHelper.CheckHint("Поиск");
    }
    @Test
    public void googleSearchListOfEmptyTest () {
        formPageHelper.GoToPage("https://www.google.ru/");
        formPageHelper.InputText("Тест");
        formPageHelper.PressEnter();
        formPageHelper.ClickOnGoogleLogo();
        formPageHelper.CheckIsEmptySearchList();
    }
}
