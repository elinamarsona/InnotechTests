package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

@Tag("InnotechTests")
public class InnotechTests extends TestBase {

    MainPage mainPage = new MainPage();
    ProductsPage productsPage = new ProductsPage();
    ContactsPage contactsPage = new ContactsPage();
    EventsPage eventsPage = new EventsPage();
    CareerPage careerPage = new CareerPage();

    @Test
    @DisplayName("Открываем главную страницу и проверяем заголовки")
    void openMainAndCheckHeaderTest() {
        mainPage
                .openPage()
                .checkHeaderVisible();
    }

    @Test
    @DisplayName("Проверка перехода с главной страницы на страницу 'Продукты'")
    void goToProductsPageTest() {
        mainPage.openPage()
                .clickProductsButton();

        productsPage.checkProductsTitle();
    }

    @Test
    @DisplayName("Проверка перехода с главной страницы на страницу 'О компании' - 'Контакты'")
    void goToContactsPageTest() {
        mainPage
                .openPage()
                .clickContactsButton();

        contactsPage.checkContactsTitle();
    }

    @Test
    @DisplayName("Проверка перехода с главной страницы на страницу 'Ресурсы' - 'Мероприятия'")
    void goToEventsPageTest() {
        mainPage
                .openPage()
                .clickEventsButton();

        eventsPage.checkEventsTitle();
    }

    @Test
    @DisplayName("Проверка перехода с главной страницы на страницу 'Карьера'")
    void goToCareerPageTest() {
        mainPage
                .openPage()
                .clickCareerButton();

        careerPage.checkCareerTitle();
    }
}