package pages;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class EventsPage {
    @Step("Проверка названия страницы мероприятий")
    public EventsPage checkEventsTitle() {
        $(".sectionstyles__NativeSection-section__sc-1k2ab1n-0").shouldHave(text("ВЕБИНАРЫ\n" +
                "И МЕРОПРИЯТИЯ"));
        return this;
    }
}