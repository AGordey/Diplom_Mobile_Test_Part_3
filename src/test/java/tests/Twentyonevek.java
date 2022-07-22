package tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
@Tag("21vek")
public class Twentyonevek extends TestBase {
    @Test
    @DisplayName("Элементы главной страницы")
    void searchTest() {

        $(AppiumBy.xpath("//android.view.View[@content-desc=\"Все акции\"]/android.widget.TextView")).shouldHave(text("Все акции"));
        $$(AppiumBy.className("android.widget.Button")).findBy(text("Каталог")).shouldHave(text("Каталог"));

    }

    @Test
    @Disabled
    void searchTest2() {

        $(AppiumBy.xpath("//android.view.View[@content-desc=\"Все акции\"]")).click();
        $(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]")).shouldHave(text("Все акции"));

    }   @Test
    @Disabled
    void searchTest3() {

        $$(AppiumBy.className("android.widget.Button")).findBy(text("Каталог")).click();
        $$(AppiumBy.className("android.view.View")).findBy(text("Каталог товаров")).shouldHave(text("Каталог товаров"));

    }
//        String searchValue = "Ubuntu";
//        back();
//        step("Type search", () -> {
//            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
//            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys(searchValue);
//        });
//        step("Verify content found", () -> {
//            $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
//                    .shouldHave(CollectionCondition.sizeGreaterThan(0));
//            $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
//                    .shouldHave(text(searchValue));
//            $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_description"))
//                    .shouldHave(text("Linux distribution developed by Canonical Ltd."));
//        });
////          Проходит на Pixel 6
//        step("Open page with article about" + searchValue, () -> {
//            $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
//                    .find(Condition.text(searchValue)).click();
//        });
//        step("Verify article about " + searchValue, () -> {
//            $(AppiumBy.className("android.view.View")).shouldHave(text(searchValue));
//       });
//    }
}