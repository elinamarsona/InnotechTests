package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    @Step ("Открыть главную страницу")
    public MainPage openPage() {
        open("/");
        return this;
    }

    @Step ("Проверить отображение заголовков")
    public MainPage checkHeaderVisible() {
        $("ul li",0).shouldHave(text("Продукты"));
        $("ul li",1).shouldHave(text("О компании"));
        $("ul li",2).shouldHave(text("Ресурсы"));
        $("ul li",3).shouldHave(text("Карьера"));
        return this;
    }

    @Step ("Клик по вкладке Продукты")
    public MainPage clickProductsButton() {
        $$("ul li").findBy(text("Продукты")).click();
        return this;
    }

    @Step ("Клик по вкладке 'О компании' - 'Контакты'")
    public MainPage clickContactsButton() {
        $$("ul li").findBy(text("О компании")).hover();
        $$("ul li a").findBy(text("Контакты")).doubleClick();
        return this;
    }

    @Step ("Клик по вкладке 'Ресурсы' - 'Мероприятия'")
    public MainPage clickEventsButton() {
        $$("ul li").findBy(text("Ресурсы")).hover();
        $$("ul li a").findBy(text("Мероприятия")).click();
        return this;
    }

    @Step ("Клик по вкладке Карьера")
    public MainPage clickCareerButton() {
        $$("ul li").findBy(text("Карьера")).click();
        return this;
    }
}