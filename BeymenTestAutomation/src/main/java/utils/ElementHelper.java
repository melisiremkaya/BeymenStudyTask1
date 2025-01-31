package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class ElementHelper {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;
    private TxtHelper txtHelper;

    public ElementHelper(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.action = new Actions(driver);
        this.txtHelper = new TxtHelper();
    }

    public WebElement findElement(By by) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        try {
            action.moveToElement(driver.findElement(by)).build().perform();
        } catch (Exception e) {
        }
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public List<WebElement> findElements(By by) {
        List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    public void click(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(findElement(by))).click();
    }

    public void clickRandom(By by){
        List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        Random random = new Random();
        int randomIndex = random.nextInt(elements.size());
        elements.get(randomIndex).click();
    }

    public void clickWithText(By by, String text) {
        boolean check = false;
        List<WebElement> elements = findElements(by);
        for (WebElement element : elements) {
            if (element.getText().contains(text)) {
                action.moveToElement(element);
                wait.until(ExpectedConditions.elementToBeClickable(element)).click();
                check = true;
                break;
            }
        }
        Assert.assertTrue(check, "Listede text : " + text + " bulunamadı");
    }

    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);
    }

    public void sendKeysKeyboard(String text) {
        switch (text) {
            case "Enter":
                action.sendKeys(Keys.ENTER).build().perform();
                break;
            case "Space":
                action.sendKeys(Keys.SPACE).build().perform();
                break;
            case "BackSpace":
                action.sendKeys(Keys.BACK_SPACE).build().perform();
                break;
            default:
                action.sendKeys(text).build().perform();
        }
    }

    public void clear(By by) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        findElement(by).clear();
        for (int i = 0; i <10; i++) {
            action.sendKeys(Keys.BACK_SPACE).build().perform();
        }
    }

    public void checkText(By by, String text) {
        WebElement element = findElement(by);
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    public void checkElement(By by) {
        Assert.assertTrue(findElement(by).isDisplayed());
    }

    public void checkUrl(String url) {
        wait.until(ExpectedConditions.urlContains(url));
    }

    public String getDropdownValue(By by) {
        return new Select(driver.findElement(by)).getFirstSelectedOption().getText();
    }

    public String getText(By by) {
        return findElement(by).getText();
    }



    public void saveText(String text) {
        txtHelper.writeTextToFile(text);
    }

    public String readText() {
        return txtHelper.readTextFromFile();
    }

}
