package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;

import org.openqa.selenium.Proxy;

import java.util.Objects;

import static java.util.Objects.nonNull;
import static utils.ProjectPropertiesUtil.getProperties;

public final class BrowserDriver {


    public static void initDriver() throws MalformedURLException {

        if (Objects.isNull(DriverManager.getDriver())) {

            if ("chrome".equals(getProperties("browser"))) {

                // Use WebDriverManager to setup the chromedriver
                WebDriverManager.chromedriver().setup();

                // Create ChromeOptions and disable notifications
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-notifications");

//                String proxyAddress = "149.19.40.78";
//                int proxyPort = 8082;
//                // Create a new Proxy object
//                Proxy proxy = new Proxy();
//                proxy.setHttpProxy(proxyAddress + ":" + proxyPort);
//                proxy.setSslProxy(proxyAddress + ":" + proxyPort);
//                options.setProxy(proxy);

                // Create the WebDriver instance
                WebDriver driver = new ChromeDriver(options);

                DriverManager.setDriver(driver);
            } else {
                throw new IllegalArgumentException("Only chrome browser supported");
            }
        }
    }

    public static void driverUnload() {
        if (nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unloadDriver();
        }
    }


}
