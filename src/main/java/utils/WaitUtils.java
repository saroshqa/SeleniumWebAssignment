package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static driver.DriverManager.getDriver;

public class WaitUtils {

    static WebDriverWait wait;

    public static void waitInit() {
        wait = new WebDriverWait(getDriver(), 10);
    }

    public static void waitUntilElementIsClickable(By element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitUntilElementIsVisible(By element){
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

}
