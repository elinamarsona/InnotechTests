package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ContactsPage {
    @Step("Проверка названия страницы контактов")
    public ContactsPage checkContactsTitle() {
        $(".sectionstyles__NativeSection-section__sc-1k2ab1n-0").shouldHave(text("Контакты"));
        return this;
    }
}