import org.testng.annotations.Test;
import pages.LoginPage;


public class FacebookPost {

    private static final String email = "automationuser1995@gmail.com";
    private static final String pass = "Tesqwe_233";
    private static final String text = "Hello World";


    @Test
    public static void loginAndPublishPostOnFacebook() {
        LoginPage i = new LoginPage();
        i.navigateToWebsite();
        i.login(email, pass);
        i.profileNameAssertion();
        i.postMessage(text);
        i.postAssertion(text);

    }


}
