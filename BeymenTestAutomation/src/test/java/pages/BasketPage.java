package pages;

import models.BasketPageModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import utils.ElementHelper;
import utils.TxtHelper;

public class BasketPage {

    WebDriver driver;
    ElementHelper elementHelper;

    public BasketPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void checkProductPrices() {
        TxtHelper txtHelper = new TxtHelper();
        String currentPrice = elementHelper.getText(BasketPageModel.productPrice);
        String previousPrice = txtHelper.readTextFromFile();
        Assert.assertTrue(previousPrice.contains(currentPrice.replace(",00 TL","")));
    }

    public void clickProductNumberDropdown() {
        elementHelper.click(BasketPageModel.productNumberDropdown);
    }

    public void selectProductNumber(String number) {
        elementHelper.clickWithText(BasketPageModel.productNumber, number);
    }

    public void checkProductNumber() {
        elementHelper.checkElement(BasketPageModel.productNumber);
    }

    public void clickDeleteButton() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        elementHelper.click(BasketPageModel.deleteButton);
    }

    public void checkEmptyBasket() {
        elementHelper.checkElement(BasketPageModel.emptyMessageText);
    }


}
