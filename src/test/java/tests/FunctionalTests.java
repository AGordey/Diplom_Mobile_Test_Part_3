package tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FunctionalTests extends TestBase {
    @Test
    @DisplayName("Наличие элементов главной страницы")
    void elementsOnMainPageTest() {

        $(AppiumBy.xpath("//android.view.View[@content-desc=\"Все акции\"]/android.widget.TextView"))
                .shouldHave(text("Все акции"));
        $$(AppiumBy.className("android.widget.Button")).findBy(text("Каталог"))
                .shouldHave(text("Каталог"));
        $$(AppiumBy.className("android.widget.Button")).findBy(text("Search"))
                .shouldHave(text("Search"));
        $$(AppiumBy.className("android.widget.TextView")).findBy(text("ПОПУЛЯРНЫЕ ТОВАРЫ"))
                .shouldHave(text("ПОПУЛЯРНЫЕ ТОВАРЫ"));
        $$(AppiumBy.className("android.webkit.WebView")).findBy(text("Онлайн-гипермаркет 21vek.by"))
                .shouldHave(text("Онлайн-гипермаркет 21vek.by"));
    }

    @Test
    @DisplayName("Открытие вкладки Все Акции")
    void tabAllPromotionsTest() {

        $(AppiumBy.xpath("//android.view.View[@content-desc=\"Все акции\"]")).click();
        $$(AppiumBy.className("android.widget.TextView")).findBy(text("Все акции")).shouldBe(visible);
        $$(AppiumBy.className("android.widget.Button")).findBy(text("Категории")).shouldBe(visible);
        $$(AppiumBy.className("android.widget.Button")).findBy(text("Фильтр")).shouldBe(visible);
    }

    @Test
    @DisplayName("Открытие вкладки Каталог")
    void tabCatalogTest() {

        $$(AppiumBy.className("android.widget.Button")).findBy(text("Каталог")).click();
        $$(AppiumBy.className("android.widget.TextView")).findBy(text("Каталог товаров")).shouldBe(visible);
    }

    @Test
    @DisplayName("Наличие разделов в Каталоге")
    void sectionInCatalogTest() {

        $$(AppiumBy.className("android.widget.Button")).findBy(text("Каталог")).click();
        $$(AppiumBy.className("android.widget.TextView")).findBy(text("Все акции")).shouldBe(visible);
        $$(AppiumBy.className("android.widget.TextView")).findBy(text("Бытовая техника")).shouldBe(visible);
        $$(AppiumBy.className("android.widget.TextView")).findBy(text("Смартфоны, ТВ и электроника")).shouldBe(visible);
        $$(AppiumBy.className("android.widget.TextView")).findBy(text("Компьютеры и периферия")).shouldBe(visible);
        $$(AppiumBy.className("android.widget.TextView")).findBy(text("Мебель")).shouldBe(visible);
        $$(AppiumBy.className("android.widget.TextView")).findBy(text("Товары для дома")).shouldBe(visible);
    }

    @Test
    @DisplayName("Добавление товара из главной страницы в корзину")
    void addProductInCardTest() {

        $$(AppiumBy.className("android.view.View"))
                .findBy(text("Подгузники-трусики детские Pampers Pants 5 Junior (150шт)")).click();
        $$(AppiumBy.className("android.widget.Button"))
                .findBy(text("В корзину")).click();
        $$(AppiumBy.className("android.widget.TextView"))
                .findBy(text("1")).shouldBe(visible);
    }
}