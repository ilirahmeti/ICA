package framework;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumWrapper {

    private static void initializeAppiumDriver(){
        appiumDriver = buildAppium();
        appiumDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    private static AppiumDriver appiumDriver;

    private static AppiumDriver buildAppium(){
        AppiumDriver appiumDriver = null;
        String appiumServerURL = "http://0.0.0.0:4723/wd/hub";
        String platformName = "android";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_6_API_28");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/ilirahmeti/Documents/ionic-conference-emulator.apk");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 30000);
        capabilities.setCapability("avd","Nexus_6_API_28");
        try {
            appiumDriver = new AndroidDriver(new URL(appiumServerURL),capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return appiumDriver;
    }


    public static AppiumDriver getAppiumDriver(){
        if(appiumDriver==null){
            try {
                initializeAppiumDriver();
            } catch (Exception e) {
                e.printStackTrace();
                Assert.fail("UNABLE TO INITIALIZE APPIUM DRIVER DUE TO INVALID SERVER URL OR THE SERVER IS ALREADY IN USE");
            }
        }
        return appiumDriver;
    }

    public static void quitAppiumDriver(){
        if(appiumDriver!=null){
            appiumDriver.quit();
            appiumDriver=null;
        }
    }

}
