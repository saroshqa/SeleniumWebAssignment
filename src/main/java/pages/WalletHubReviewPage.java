package pages;

import org.openqa.selenium.By;

import static commons.CommonAssertions.textAssertion;
import static utils.BrowserUtils.*;
import static utils.ProjectPropertiesUtil.getProperties;

public class WalletHubReviewPage {
    private final By reviewSection = By.xpath("//div[@class=\"rv review-action ng-enter-element\"]");
    private final By fourStar = By.xpath("//div[@class=\"rv review-action ng-enter-element\"]//div//*[@aria-label=\"4 star rating\"]");
    private final By option = By.xpath("//li[text()='Health Insurance']");
    private final By textArea = By.xpath("//textarea[@placeholder=\"Write your review...\"]");
    private final By submitBtn = By.xpath("//div[contains(text(),'Submit')]");
    private final By selectBtn = By.xpath("//span[contains(text(),'Select...')]");
    private final By loginSelection = By.xpath("//li[@ng-class=\"{selected: is_tab('login')}\"]");
    private final By emailField = By.xpath("//input[@id='em-ipt']");
    private final By passField = By.xpath("//input[@id='pw1-ipt']");
    private final By loginBtn = By.cssSelector(".btns > button.btn.blue.touch-element-cl");
    private final By review = By.xpath("//article[@data-rvid][1]/div[@itemprop=\"description\"]");
    private final By reviewer = By.xpath("//article[@data-rvid][1]//span[@class=\"rvtab-ci-nickname regular-font\"]");


    public void writeReview(String text) {
        scrollToElement(reviewSection);
        hover(fourStar);
        click(fourStar);
        click(selectBtn);
        click(option);
        sendKeys(textArea, text);
        click(submitBtn);

    }

    public void navigateToWebsite() {
        browseUrl(getProperties("WHURL"));
        maximizeBrowser();
    }


    public void login(String email, String pass) {
        click(loginSelection);
        sendKeys(emailField, email);
        sendKeys(passField, pass);
        click(loginBtn);

    }

    public void reviewAssertion(String name, String reviewText) {
        textAssertion(reviewer, name);
        textAssertion(review, reviewText);
    }
}
