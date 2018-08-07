package framework;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends MobileBasePage {

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='4']")
    private MobileElement searchField;

//    @AndroidFindBy(xpath = "//android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]")
    @AndroidFindBy(accessibility = "8:00 am")
    private MobileElement firstRowSearchResult;

    @AndroidFindBy(xpath = "//android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]")
    private MobileElement filterButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='0']")
    private MobileElement menuButton;

    @AndroidFindBy(xpath = "//android.webkit.WebView[1]/android.view.View[1]/android.widget.Button[1]")
    private MobileElement firstButton;

    @AndroidFindBy(xpath = "//android.webkit.WebView[1]/android.view.View[1]/android.widget.Button[2]")
    private MobileElement secondButton;

    @AndroidFindBy(xpath = "//android.webkit.WebView[1]/android.view.View[1]/android.widget.Button[3]")
    private MobileElement thirdButton;

    @AndroidFindBy(xpath = "//android.webkit.WebView[1]/android.view.View[1]/android.widget.Button[4]")
    private MobileElement fourthButton;

    @AndroidFindBy(xpath = "//android.webkit.WebView[1]/android.view.View[1]/android.widget.Button[5]")
    private MobileElement fifthButton;

    @AndroidFindBy(xpath = "//android.webkit.WebView[1]/android.view.View[1]/android.widget.Button[6]")
    private MobileElement sixthButton;

    @AndroidFindBy(xpath = "//android.webkit.WebView[1]/android.view.View[1]/android.widget.Button[7]")
    private MobileElement seventhButton;

    @AndroidFindBy(xpath = "//android.webkit.WebView[1]/android.view.View[1]/android.widget.Button[8]")
    private MobileElement eighthButton;

    public void serchText(String text) {
        setValue(searchField, text);
    }

    public String getBreakfastText(){
        return getValue(firstRowSearchResult);
    }

    public void tapOnFilterButton() {
        tapOn(filterButton);
    }

    public void tapOnMenuButton() {
        tapOn(menuButton);
    }

    public boolean isBreakfastDisplayed(){
        return isElementDisplayed(firstRowSearchResult);
    }

    MobileElement[] allButtons = {firstButton,secondButton,thirdButton,
            fourthButton,fifthButton,sixthButton,seventhButton,eighthButton};

    public boolean allfieldsAreDisplayed(){
       return areElementsDisplayed(allButtons);

    }

}
