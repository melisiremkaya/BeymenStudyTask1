package models;

import org.openqa.selenium.By;

public class ProductDetailPageModel {
    public static By productInfo = By.cssSelector("span.o-productDetail__description");
    public static By productPrice = By.xpath("//ins[@id='priceNew']");
    public static By sizeButton = By.cssSelector(".m-variation__item:not([class*='-disabled'])");
    public static By addToCartButton = By.xpath("//*[@id=\"addBasket\"]");
    public static By goToBasketButton = By.cssSelector(".m-notification__button.btn");
}
