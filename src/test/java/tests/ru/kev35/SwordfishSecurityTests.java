package tests.ru.kev35;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class SwordfishSecurityTests extends TestBaseSwordfishSecurity {
    MainPage data = new MainPage();

    @Test
    @Tag("mainPage")
    @DisplayName("Проверка разделов главного меню страницы")
    public void checkMainMenuComponents() {
        step("Открываем главную страницу сайта", () -> {
            data.openPage()
                    .removingBanner();
        });

        step("Проверяем состав разделов", () -> data.checkButtonServices("Услуги")
                .checkButtonCenterOfExpertise("Центр экспертизы")
                .checkButtonAboutTheCompany("О компании")
                .chekButtonContacts("Контакты"));
    }

    @Test
    @Tag("mainPage")
    @DisplayName("Поиск информации \"О Компании\" в поле \"Search\"")
    public void searchInfo1() {

        step("Открываем главную страницу сайта", () -> data.openPage()
                .removingBanner()
                .clickButtonSearch());

        step("В поле поиска вбиваем данные \"О компании\"", () -> data.setTextInFildSearch("О компании"));
        step("Проверяем результаты запроса", () -> data.checkTextOnBoardResults("О компании"));
    }

    @Test
    @Tag("mainPage")
    @DisplayName("Поиск информации \"Контакты\" в поле \"Search\"")
    public void searchInfo2() {

        step("Открываем главную страницу сайта", () -> data
                .openPage()
                .removingBanner()
                .clickButtonSearch());

        step("В поле поиска вбиваем данные = Контакты", () -> data.setTextInFildSearch("Контакты"));
        step("Проверяем результаты запроса", () -> data.checkTextOnBoardResults("Контакты"));
    }

    @Test
    @Tag("mainPage")
    @DisplayName("Открытие меню \"Связаться с нами\"")
    public void openMenuCallToAss() {
        step("Открываем главную страницу сайта", () -> {
            data.openPage()
                    .removingBanner();
        });

        step("Кликаем на кнопку \"Связаться с нами\"", () -> data.clickCallToUs());
        step("Проверяем результаты запроса", () -> data.checkMenuCallToAss("Связаться с нами"));
    }

    @Test
    @Tag("mainPage")
    @DisplayName("Клик кнопка \"Подробнее\"")
    public void openCenterOfExpertise() {
        step("Открываем главную страницу сайта", () -> {
            data.openPage()
                    .removingBanner();
        });

        step("Клик на кнопку \"Подробнее\"", () -> data.clickDetails());
        step("Проверяем результаты запроса", () -> data.checkDetails("DevSecOps и AI Security"));
    }
}