package framework;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import static util.AllureUtil.takeMobileScreenshot;

public class MobileBasePage {

    public MobileBasePage() {
        initPageElements();
    }

    protected void initPageElements() {
        PageFactory.initElements(new AppiumFieldDecorator(AppiumWrapper.getAppiumDriver(), 15, TimeUnit.SECONDS), this);
    }

    public void tapOn(MobileElement mobileElement) {
        try {
            mobileElement.click();
        } catch (Exception e) {
            e.printStackTrace();
            takeMobileScreenshot();
            throw new NoSuchElementException("UNABLE TO LOCATE THIS ELEMENT USING: " + mobileElement.toString());
        }
    }

    public void tapOn2(MobileElement mobileElement) {
        try {
            Actions action = new Actions(AppiumWrapper.getAppiumDriver());
            action.moveToElement(mobileElement).click().perform();
        } catch (Exception e) {
            e.printStackTrace();
            takeMobileScreenshot();
            throw new NoSuchElementException("UNABLE TO LOCATE THIS ELEMENT USING: " + mobileElement.toString());
        }
    }

    public void setValue(MobileElement mobileElement, String setValue) {
        try {
            mobileElement.sendKeys(setValue);
        } catch (Exception e) {
            e.printStackTrace();
            takeMobileScreenshot();
            throw new NoSuchElementException("UNABLE TO LOCATE THIS ELEMENT USING: " + mobileElement.toString());
        }
    }

    public String getValue(MobileElement mobileElement) {
        String text = null;
        try {
            text = mobileElement.getText();
        } catch (Exception e) {
            e.printStackTrace();
            takeMobileScreenshot();
            Assert.fail("UNABLE TO LOCATE THIS ELEMENT USING: " + mobileElement.toString());
        }
        return text;
    }

    public boolean isElementDisplayed(MobileElement mobileElement) {
        try {
            return mobileElement.isDisplayed();
        } catch (Exception e) {
            takeMobileScreenshot();
            e.printStackTrace();
        }
        return false;
    }

    public boolean areElementsEnabled(MobileElement[] mobileElement){
        try {
            for (int i = 0; i < mobileElement.length; i++) {
                if(mobileElement[i].isEnabled()){
                    return true;
                }
            }
        } catch (Exception e) {
            takeMobileScreenshot();
            e.printStackTrace();
        }
        return false;
    }

    public boolean areElementsDisplayed(MobileElement[] mobileElement){
        try {
            for (int i = 0; i < mobileElement.length; i++) {
                if(mobileElement[i].isDisplayed()){
                    return true;
                }
            }
        } catch (Exception e) {
            takeMobileScreenshot();
            e.printStackTrace();
        }
        return false;
    }

   public enum DIRECTION {UP, DOWN, LEFT, RIGHT}

    public void swipe(AppiumDriver driver, DIRECTION direction, long duration) {
        Dimension size = AppiumWrapper.getAppiumDriver().manage().window().getSize();

        int startX = 0;
        int endX = 0;
        int startY = 0;
        int endY = 0;

        switch (direction) {
            case LEFT:
                startY = (int) (size.height / 2);
                startX = (int) (size.width * 0.90);
                endX = (int) (size.width * 0.05);
                break;

            case RIGHT:
                startY = (int) (size.height / 2);
                startX = (int) (size.width * 0.05);
                endX = (int) (size.width * 0.90);
                break;

            case UP:
                endY = (int) (size.height * 0.70);
                startY = (int) (size.height * 0.30);
                startX = (size.width / 2);
                break;


            case DOWN:
                startY = (int) (size.height * 0.70);
                endY = (int) (size.height * 0.30);
                startX = (size.width / 2);

                break;

        }
        new TouchAction(driver).press(startX, startY).waitAction(Duration.ofMillis(duration)).moveTo(endX, startY).release().perform();
    }

}
