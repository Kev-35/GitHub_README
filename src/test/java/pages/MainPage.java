package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement
            buttonSearch = $("[data-elem-id='1749735775626']"),
            fildSearch = $("#rec1099102516").$("[placeholder='Search']"),
            textOnBoardResult = $(".t-title"),
            buttonServices = $("#molecule-174858653564456840"),
            buttonCenterOfExpertise = $("#molecule-174858653564456840"),
            buttonAboutTheCompany = $("#molecule-174858653564456840"),
            buttonContacts = $("#molecule-174858653564456840"),
            callToAss = $("[data-elem-id='1748586525311']"),
            menuCallToAss = $("div#popuptitle_1194990936");


    public MainPage removingBanner() {
        executeJavaScript("$('#t-footer').remove();");
        return this;
    }

    public MainPage openPage() {
        open(baseUrl);
        return this;
    }

    public void clickButtonSearch() {
        buttonSearch.click();
    }

    public void setTextInFildSearch(String value) {
        fildSearch.setValue(value).pressEnter();

    }

    public void checkTextOnBoardResults(String value) {
        textOnBoardResult.shouldHave(text(value));
    }

    public MainPage checkbuttonServices(String value) {
        buttonServices.shouldHave(text(value));
        return this;
    }

    public MainPage checkbuttonCenterOfExpertise(String value) {
        buttonCenterOfExpertise.shouldHave(text(value));
        return this;
    }

    public MainPage checkbuttonAboutTheCompany(String value) {
        buttonAboutTheCompany.shouldHave(text(value));
        return this;
    }

    public void checkbuttonContacts(String value) {
        buttonContacts.shouldHave(text(value));
    }

    public void clickCallToUs() {
        callToAss.click();
    }

    public void checkMenuCallToAss(String value) {
        menuCallToAss.shouldHave(text(value));
    }
}