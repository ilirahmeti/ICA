package framework.mobilePages;

import framework.AppiumWrapper;
import framework.MobileBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SplashScreenPage extends MobileBasePage {

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Welcome to ICA']")
    private MobileElement title;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='SKIP ']")
    private MobileElement skipButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='0']")
    private MobileElement continueText;

    public boolean isTitleDisplayed() {
        return isElementDisplayed(title);
    }

    public void clickOnSkip() {
        tapOn(skipButton);
    }

    public void swipeLeft() {
        swipe(AppiumWrapper.getAppiumDriver(),DIRECTION.LEFT,100);
    }

    public boolean isContinueDisplayed(){
       return isElementDisplayed(continueText);
    }

}
