package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.DriverFactory;

public class HomePageSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    @Given("user is on the Beymen Home Page")
    public void openBeymenHomePage() {
        homePage.checkHomePage();
    }

    @Then("should see Search Area on Home Page")
    public void shouldSeeSearchAreaOnHomePage() {
        homePage.checkSearchBox();
    }

    @When("click Accept Cookies Button on Home Page")
    public void clickAcceptCookiesButtonOnHomePage() {
        homePage.clickAcceptCookiesButton();
    }

    @And("click Women Gender Button in choose gender popup on Home Page")
    public void clickWomenGenderButtonInChooseGenderPopupOnHomePage() {
        homePage.clickWomenGenderButtonPopup();
    }

    @And("click to Search Box on Home Page")
    public void clickToSearchBoxOnHomePage() {
        homePage.clickSearchBox();
    }

    @And("get first value in excel and type to SearchBox on Home Page")
    public void getFirstValueInExcelAndTypeToSearchBoxOnHomePage() {
        homePage.sendKeysSearchBoxFirst();
    }

    @And("clear SearchBox on Home Page")
    public void clearSearchBoxOnHomePage() {
        homePage.clearSearchBox();
    }

    @And("get second value in excel and type SearchBox on Home Page")
    public void getSecondValueInExcelAndTypeSearchBoxOnHomePage() {
        homePage.sendKeysSearchBoxSecond();
    }






}
