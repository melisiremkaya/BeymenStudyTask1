package models;

import org.openqa.selenium.By;

public class BasketPageModel {

    public static By productInfo = By.cssSelector("span.m-basket__productInfoName");
    public  static By productPrice = By.cssSelector("span.priceBox__salePrice");
    public static By productNumberDropdown = By.id("quantitySelect0-key-0");
    public static By productNumber = By.cssSelector("#quantitySelect0-key-0>option");
    public static By deleteButton = By.id("removeCartItemBtn0-key-0");
    public static By emptyMessageText = By.xpath("//div[@id='emtyCart']//strong[@class='m-empty__messageTitle']");

}
