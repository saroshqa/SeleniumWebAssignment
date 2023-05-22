package utils;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.LoginPage;

import static utils.WaitUtils.waitUntilElementIsClickable;
import static driver.DriverManager.getDriver;


public class BrowserUtils {

    private static final Actions actions = new Actions(getDriver());

    private static final Logger logger = (Logger) LogManager.getLogger(LoginPage.class);


    public static void browseUrl(String url) {

        getDriver().get(url);
        logger.info("Navigating to url: " + url);

    }


    public static void maximizeBrowser() {
        getDriver().manage().window().maximize();
    }

    public static WebElement elementBy(By value) {
        return getDriver().findElement(value);
    }


    public static void click(By element) {

        waitUntilElementIsClickable(element);
        elementBy(element).click();
        logger.info("clicking the element " + element);


    }


    public static void sendKeys(By element, String text) {

        waitUntilElementIsClickable(element);
        elementBy(element).sendKeys(text);
        logger.info("clicking the element " + element);
        logger.info("inserting text: " + text);


    }

    public static void selectElement(By locator, String value) {

        waitUntilElementIsClickable(locator);
        Select items = new Select(elementBy(locator));
        items.selectByValue(value);
        logger.info("Selecting the value " + value + " from the list of element " + locator);
    }


    public static void hover(By element) {

        WebElement ele = getDriver().findElement(element);
        actions.moveToElement(ele).perform();
        logger.info("moving to element: " + ele);
    }


    public static void scrollToElement(By element){

        WebElement scrollElement = getDriver().findElement(element);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", scrollElement);
    }

}


