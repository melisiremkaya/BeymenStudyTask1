package pages;

import models.GeneralPageModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class General {
    WebDriver driver;
    ElementHelper elementHelper;


    public General(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void sendKeysKeyboard(String button) {
        elementHelper.sendKeysKeyboard(button);
    }
}
