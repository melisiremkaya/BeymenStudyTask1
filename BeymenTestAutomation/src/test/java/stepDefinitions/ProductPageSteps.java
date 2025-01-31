package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductPage;
import utils.DriverFactory;

public class ProductPageSteps {

    ProductPage productPage = new ProductPage(DriverFactory.getDriver());
    @And("click randomly a Product on Product Page")
    public void clickRandomlyAProductOnProductPage() {
        productPage.clickProduct();
    }
}
