package pages;

import io.cucumber.java.an.E;
import models.HomePageModel;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;
import utils.ExcelHelper;


public class HomePage {

    WebDriver driver;
    ElementHelper elementHelper;
    General general;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
        general = new General(driver);
    }


    public void checkHomePage() {
        elementHelper.checkUrl("https://www.beymen.com/tr");
    }

    public void checkSearchBox() {
        elementHelper.checkElement(HomePageModel.searchBox);
    }

    public void clickAcceptCookiesButton() {
        elementHelper.click(HomePageModel.acceptCookiesButton);
    }

    public void clickWomenGenderButtonPopup() {
        elementHelper.click(HomePageModel.genderWomenButton);
    }

    public void clickSearchBox() {
        elementHelper.click(HomePageModel.searchBox);
    }

    public void clearSearchBox() {
        elementHelper.clear(HomePageModel.searchBoxTextbox);
    }

    public void sendKeysSearchBoxFirst() {
        ExcelHelper excelHelper = new ExcelHelper();
        String productName = excelHelper.getTextFromCell("productName", 1, 1);
        elementHelper.sendKeys(HomePageModel.searchBoxTextbox, productName);
    }
    public void sendKeysSearchBoxSecond() {
        ExcelHelper excelHelper = new ExcelHelper();
        String productName = excelHelper.getTextFromCell("productName", 1, 2);
        elementHelper.sendKeys(HomePageModel.searchBoxTextbox, productName);
    }
}
