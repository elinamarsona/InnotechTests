package pages;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CareerPage {
    @Step("Проверка названия страницы карьеры")
    public CareerPage checkCareerTitle() {
        Selenide.switchTo().window(1);
        $("h3").shouldHave(text("Команда \n" +
                "больших \n" +
                "идей"));
        return this;
    }
}