package pages;

import org.openqa.selenium.By;

import static commons.CommonAssertions.elementDisplayed;
import static commons.CommonAssertions.textAssertion;
import static utils.BrowserUtils.*;
import static utils.ProjectPropertiesUtil.getProperties;
import static utils.WaitUtils.waitUntilElementIsVisible;

public class LoginPage {

    private final By emailField = By.id("email");
    private final By paswrdField = By.id("pass");
    private final By loginBtn = By.xpath("//button[@name='login']");
    private final By profileName = By.xpath("//span[contains(text(),'Automation Man')]");

    private final By postField = By.xpath("//span[contains(text(),\"What's on your mind\")]");

    private final By postTextbox = By.xpath("//div[@class='_1mf _1mj']");
    private final By postButton = By.xpath("//span[contains(text(),'Post')]");

    private final By home = By.xpath("//a[@aria-label=\"Home\"]");

    private final By postText = By.xpath("//*[contains(text(), 'Hello World')]");

    public void navigateToWebsite() {
        browseUrl(getProperties("FBURL"));
        maximizeBrowser();
    }

    public void login(String email, String pass) {
        sendKeys(emailField, email);
        sendKeys(paswrdField, pass);
        click(loginBtn);
    }

    public void profileNameAssertion() {
        elementDisplayed(profileName);
    }

    public void postMessage(String text) {
        click(home);
        click(postField);
        sendKeys(postTextbox, text);
        click(postButton);

    }

    public void postAssertion(String text) {
        waitUntilElementIsVisible(postText);
        textAssertion(postText, text);
    }

}
