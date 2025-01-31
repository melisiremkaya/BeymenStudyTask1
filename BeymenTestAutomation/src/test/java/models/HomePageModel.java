package models;

import org.openqa.selenium.By;

public class HomePageModel {

    public static By searchBox = By.cssSelector(".o-header__search--input");
    public static By searchBoxTextbox = By.id("o-searchSuggestion__input");
    public static By acceptCookiesButton = By.id("onetrust-accept-btn-handler");
    public static By genderWomenButton = By.id("genderWomanButton");
}
