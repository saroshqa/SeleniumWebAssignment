package commons;


import org.openqa.selenium.By;
import org.testng.Assert;
import utils.BrowserUtils;

import static driver.DriverManager.getDriver;
import static utils.WaitUtils.waitUntilElementIsVisible;

public class CommonAssertions {


    public static void textAssertion(By element, String expected) {


            waitUntilElementIsVisible(element);
            String text = BrowserUtils.elementBy(element).getText();
            Assert.assertEquals(text, expected);



    }


    public static void elementDisplayed(By element) {
        waitUntilElementIsVisible(element);
        Assert.assertTrue(getDriver().findElement(element).isDisplayed());

    }
}
