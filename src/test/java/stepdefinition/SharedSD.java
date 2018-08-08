package stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import utility.ConfigReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SharedSD {

    private static WebDriver driver = null;
    private static String username = "ilirahmeti";
    private static String sauceAccessKey = "4dca8ff8-4531-452d-9ed2-0694cd48fd60";
    private static String sauce_Url = "https://" + username + ":" + sauceAccessKey + "@ondemand.saucelabs.com:443/wd/hub";

    @Before("@web")
    public static void before() {
        ConfigReader configReader = new ConfigReader();
        if (configReader.getRun_test().equals("sauce")) {
            DesiredCapabilities capabilities = null;
            switch (configReader.getBrowser()) {
                case "firefox":
                    capabilities = new DesiredCapabilities().firefox();
                    break;
                case "chrome":
                    capabilities = new DesiredCapabilities().chrome();
                    break;
                case "safari":
                    capabilities = new DesiredCapabilities().safari();
                    break;
                case "internetExplorer":
                    capabilities = new DesiredCapabilities().internetExplorer();
            }
            capabilities.setCapability("platform", configReader.getPlatform());
            capabilities.setCapability("version", configReader.getVersion());

            try {
                driver = new RemoteWebDriver(new URL(sauce_Url), capabilities);
                driver.get(configReader.getUrl());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

        } else {
            System.setProperty("webdriver.chrome.driver", configReader.getDriverLocation());
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.get(configReader.getUrl());
        }
    }

    @After("@web")
    public static void after() {
        if (driver != null) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
