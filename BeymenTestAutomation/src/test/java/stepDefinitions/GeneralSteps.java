package stepDefinitions;

import io.cucumber.java.en.And;
import pages.General;
import utils.DriverFactory;

public class GeneralSteps {

    General general = new General(DriverFactory.getDriver());
    @And("tap {string} on Keyboard")
    public void tapOnKeyboard(String text) {
        general.sendKeysKeyboard(text);
    }
}
