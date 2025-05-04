package pages;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class EventsPage {
    @Step("Проверка названия страницы мероприятий")
    public EventsPage checkEventsTitle() {
        actions().sendKeys(Keys.HOME);
        $(".sectionstyles__NativeSection-section__sc-1k2ab1n-0").shouldHave(text("ВЕБИНАРЫ\n" +
                "И МЕРОПРИЯТИЯ"));
        return this;
    }
}