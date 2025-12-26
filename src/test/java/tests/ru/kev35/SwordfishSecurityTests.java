package tests.ru.kev35;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import testBase.TestBaseSwordfishSecurity;

import static io.qameta.allure.Allure.step;

public class SwordfishSecurityTests extends TestBaseSwordfishSecurity {
    MainPage data = new MainPage();

    @Test
    @Tag("mainPage")
    @DisplayName("Проверка разделов главного меню")
    public void mainTextOnBanner() {
        step("Открываем главную страницу сайта", () -> {
            data.openPage()
                    .removingBanner();
        });

        step("Кликаем на кнопку - Услуги", () -> data.clickButtonSearch());

        step("Проверяем состав разделов", () -> data.checkbuttonServices("Услуги")
                .checkbuttonCenterOfExpertise("Центр экспертизы")
                .checkbuttonAboutTheCompany("О компании")
                .checkbuttonContacts("Контакты"));
    }

    @Test
    @Tag("mainPage")
    @DisplayName("Поиск информации \"О Компании\" в поле \"Search\"")
    public void searchInfo1() {

        step("Открываем главную страницу сайта", () -> data.openPage()
                .removingBanner()
                .clickButtonSearch());

        step("В поле поиска вбиваем данные = О компании", () -> data.setTextInFildSearch("О компании"));

        step("Проверяем результаты запроса", () -> data.checkTextOnBoardResults("Results for: О компании"));
    }

    @Test
    @Tag("mainPage")
    @DisplayName("Поиск информации \"Контакты\" в поле \"Search\"")
    public void searchInfo2() {

        step("Открываем главную страницу сайта", () -> data.openPage()
                .removingBanner()
                .clickButtonSearch());

        step("В поле поиска вбиваем данные = Контакты", () -> data.setTextInFildSearch("Контакты"));

        step("Проверяем результаты запроса", () -> data.checkTextOnBoardResults("Results for: Контакты"));
    }

    @Test
    @Tag("mainPage")
    @DisplayName("Открытие меню \"Связаться с нами\"")
    public void openMenuCallToAss() {
        step("Открываем главную страницу сайта", () -> {
            data.openPage()
                    .removingBanner();
        });

        step("Кликаем на кнопку - Услуги", () -> data.clickCallToUs());

        step("Проверяем результаты запроса", () -> data.checkMenuCallToAss("Связаться с нами"));
    }
}