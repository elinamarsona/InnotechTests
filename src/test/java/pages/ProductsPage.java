package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ProductsPage {
    @Step("Проверка названия страницы продуктов")
    public ProductsPage checkProductsTitle() {
        $(".markdownstyles__StyledReactMarkdown-foundation-kit__sc-v45gkz-0").shouldHave(text("Продукты"));
        return this;
    }
}
