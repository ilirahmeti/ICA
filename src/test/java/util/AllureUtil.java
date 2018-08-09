package util;

import framework.AppiumWrapper;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;

public class AllureUtil {

    /**
     * This method is used to attached screenshot in Allure report
     * @param screenShot
     * @return
     */
    @Attachment(value = "Page screenshot", type = "image/png")
    public static byte[] attachScreenshot(byte[] screenShot) {

        return screenShot;
    }

    /**
     * This method is used to take screenshot in mobile and attach it to allure report
     */
    public static void takeMobileScreenshot() {
        final byte[] screenshot = ((TakesScreenshot)AppiumWrapper.getAppiumDriver()).getScreenshotAs(OutputType.BYTES);
        AllureUtil.attachScreenshot(screenshot);
    }
}
