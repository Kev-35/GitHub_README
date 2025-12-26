package testBase;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.Map;
import static com.codeborne.selenide.Selenide.*;

public class TestBaseSwordfishSecurity {

    @BeforeAll
    static void setUpConfig() {

        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserVersion = System.getProperty("browserVersion", "127.0");
        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
        Configuration.remote = ("https://user1:1234@selenoid.autotests.cloud/wd/hub");
        Configuration.baseUrl = "https://swordfish-security.ru/";
        Configuration.pageLoadStrategy = "eager";
        Configuration.headless = false;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void closeUp() {
        closeWebDriver();
    }

    @AfterEach
    void tearDown() {
        // Очистка cookies после каждого теста
        clearBrowserCookies();
        clearBrowserLocalStorage();
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}
