package utilis;

import org.awaitility.Awaitility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Interactions {

    private final int TIMEOUT = 5;
    protected WebDriver driver;

    public Interactions(WebDriver driver) {
        this.driver = driver;
    }

    public void awaitUntilElementDisplayed(By selector) {
        Awaitility.await().atMost(TIMEOUT, TimeUnit.SECONDS).ignoreExceptions().until(() -> driver.findElement(selector).isDisplayed());
    }

    public void click(By selector) {
        awaitUntilElementDisplayed(selector);
        driver.findElement(selector).click();
    }

    public void sendKeys(By selector, String keys) {
        awaitUntilElementDisplayed(selector);
        driver.findElement(selector).click();
        driver.findElement(selector).sendKeys(keys);
    }

    public void clear(By selector) {
        awaitUntilElementDisplayed(selector);
        driver.findElement(selector).clear();
    }

    public void clearByKeys(By selector) {
        awaitUntilElementDisplayed(selector);
        driver.findElement(selector).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
    }

    public boolean isElementDisplayed(By selector) {
        boolean elementPresent = false;
        try {
            if (driver.findElement(selector).isDisplayed()) {
                elementPresent = true;
            }
        } catch (NoSuchElementException e) {
            System.out.println("Element is not present" + e);
        }
        return elementPresent;
    }

    public void mouseOverElementAndClickOnSubElement(By elementToExpand, By subElement) {
        awaitUntilElementDisplayed(elementToExpand);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(elementToExpand)).perform();
        awaitUntilElementDisplayed(subElement);
        driver.findElement(subElement).click();
    }

    public void refreshPage() {
        JavascriptExecutor method = ((JavascriptExecutor) driver);
        method.executeScript("document.location.reload()");
    }

    public void scrollPage(int scrollFactor) {
        JavascriptExecutor scroll = ((JavascriptExecutor) driver);
        scroll.executeScript("window.scrollBy(0, " + scrollFactor + ")");
    }
    public void scrollToVisibleOfElement(By selector) {
        awaitUntilElementDisplayed(selector);
        JavascriptExecutor scroll = ((JavascriptExecutor) driver);
        scroll.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(selector));
    }

    public void scrollToBottomOfPage() {
        JavascriptExecutor scroll = ((JavascriptExecutor) driver);
        scroll.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void moveSlider(By slider, int shiftX, int shiftY) {
        awaitUntilElementDisplayed(slider);
        Actions move = new Actions(driver);
        move.dragAndDropBy(driver.findElement(slider), shiftX, shiftY).click();
        move.build().perform();
    }
    public void rightClick(By selector) {
        awaitUntilElementDisplayed(selector);
        Actions clicker = new Actions(driver);
        clicker.contextClick(driver.findElement(selector)).perform();
    }
}

