package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class ContactsPage {
    @Step("Проверка названия страницы контактов")
    public ContactsPage checkContactsTitle() {
        actions().sendKeys(Keys.HOME);
        $(".sectionstyles__NativeSection-section__sc-1k2ab1n-0").shouldHave(text("Контакты"));
        return this;
    }
}