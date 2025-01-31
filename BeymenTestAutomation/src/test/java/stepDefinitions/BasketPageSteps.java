package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasketPage;
import utils.DriverFactory;

public class BasketPageSteps {

    BasketPage basketPage = new BasketPage(DriverFactory.getDriver());

    @Then("check Product Prices on Basket Page")
    public void checkProductPricesOnBasketPage() {
        basketPage.checkProductPrices();
    }

    @When("click Product Number Dropdown on Basket Page")
    public void clickProductNumberDropdownOnBasketPage() {
        basketPage.clickProductNumberDropdown();
    }

    @And("select Product Number: {string} in Dropdown list on Basket Page")
    public void selectProductNumberInDropdownListOnBasketPage(String number) {
        basketPage.selectProductNumber(number);
    }

    @Then("should see Dropdown Text: {string} on Basket Page")
    public void shouldSeeDropdownTextOnBasketPage(String arg0) {
        basketPage.checkProductNumber();
    }

    @When("click Delete Button on Basket Page")
    public void clickDeleteButtonOnBasketPage() {
        basketPage.clickDeleteButton();
    }

    @Then("should see Empty Basket Message on Basket Page")
    public void shouldSeeEmptyBasketMessageOnBasketPage() {
        basketPage.checkEmptyBasket();
    }



}
