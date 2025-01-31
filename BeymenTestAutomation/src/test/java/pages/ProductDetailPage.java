package pages;

import models.ProductDetailPageModel;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ProductDetailPage {

    WebDriver driver;
    ElementHelper elementHelper;

    public ProductDetailPage(WebDriver driver){
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }
    public String getProductInfo(){
        return elementHelper.getText(ProductDetailPageModel.productInfo);
    }
    public String getProductPrice(){
        return elementHelper.getText(ProductDetailPageModel.productPrice);
    }
    public void selectSize(){
        elementHelper.clickRandom(ProductDetailPageModel.sizeButton);
    }
    public void clickAddToCartButton(){elementHelper.click(ProductDetailPageModel.addToCartButton);}
    public void clickGoToBasketButton(){elementHelper.click(ProductDetailPageModel.goToBasketButton);}
}
