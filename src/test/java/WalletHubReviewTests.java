import org.testng.annotations.Test;
import pages.WalletHubReviewPage;

public class WalletHubReviewTests {
    private static final String email = "saroshhasanzia@gmail.com";
    private static final String pass = "Tesqwe_233";
    private static final String feedback = "Lorem ipsum dolor sit amet, testing test Lorem ipsum dolor sit amet, testing test Lorem ipsum dolor sit amet, testing test Lorem ipsum dolor sit amet.";
    private static final String name = "@saroshhasanzia";

    @Test
    public static void writeAReviewAndAssert() throws InterruptedException {

        WalletHubReviewPage w = new WalletHubReviewPage();
        w.navigateToWebsite();
        w.writeReview(feedback);
        w.login(email, pass);
        w.reviewAssertion(name, feedback);

    }
}
