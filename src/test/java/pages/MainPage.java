package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement
            buttonSearch = $("[data-elem-id='1749735775626']"),
            filedSearch = $("#rec1099102516").$("[placeholder='Search']"),
            textOnBoardResult = $(".t-title"),
            callToAss = $("[data-elem-id='1748586525311']"),
            menuCallToAss = $("div#popuptitle_1194990936");

    private final ElementsCollection
            buttonServices = $$("a[href='#submenu:services']"),
            buttonCenterOfExpertise = $$("a[href='/expert-center']"),
            buttonAboutTheCompany = $$("a[href='#submenu:about']"),
            buttonContacts = $$("a[href='/contacts']"),
            buttonDetails = $$("a[href='/services']");

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
        filedSearch.setValue(value).pressEnter();
    }

    public void checkTextOnBoardResults(String value) {
        textOnBoardResult.shouldHave(text(value));
    }

    public MainPage checkButtonServices(String value) {
        buttonServices.findBy(visible).shouldHave(text(value));
        return this;
    }

    public MainPage checkButtonCenterOfExpertise(String value) {
        buttonCenterOfExpertise.findBy(visible).shouldHave(text(value));
        return this;
    }

    public MainPage checkButtonAboutTheCompany(String value) {
        buttonAboutTheCompany.findBy(visible).shouldHave(text(value));
        return this;
    }

    public void chekButtonContacts(String value) {
        buttonContacts.findBy(visible).shouldHave(text(value));
    }

    public void clickCallToUs() {
        callToAss.click();
    }

    public void clickDetails() {
        buttonDetails.get(1).click();
    }

    public void checkMenuCallToAss(String value) {
        menuCallToAss.shouldHave(text(value));
    }

    public void checkDetails(String value) {
        buttonDetails.get(2).find(String.valueOf(Condition.text(value)));
    }
}