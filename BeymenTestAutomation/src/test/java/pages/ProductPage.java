package pages;

import models.ProductPageModel;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ProductPage {

    WebDriver driver;
    ElementHelper elementHelper;

    public ProductPage(WebDriver driver){
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }
    public void clickProduct(){
        elementHelper.clickRandom(ProductPageModel.productsList);
    }
}
