package stepDefinitions;

import io.cucumber.java.en.And;
import pages.ProductDetailPage;
import utils.DriverFactory;
import utils.TxtHelper;

public class ProductDetailPageSteps {

    ProductDetailPage productDetailPage = new ProductDetailPage(DriverFactory.getDriver());
    @And("save Product Info and Price on Product Detail Page")
    public void saveProductInfoAndPriceOnProductDetailPage() {
        TxtHelper txtHelper = new TxtHelper();
        txtHelper.writeTextToFile(productDetailPage.getProductInfo()+productDetailPage.getProductPrice());
    }

    @And("select Random Size on Product Detail Page")
    public void selectSizeOnProductDetailPage() {
        productDetailPage.selectSize();
    }

    @And("click Add to cart button on Product Detail Page")
    public void clickAddToCartButtonOnProductDetailPage() {
        productDetailPage.clickAddToCartButton();
    }

    @And("click Go To Basket Button on Product Detail Page")
    public void clickGoToBasketButtonOnProductDetailPage() {
        productDetailPage.clickGoToBasketButton();
    }
}
