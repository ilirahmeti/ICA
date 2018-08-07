package framework;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FilterPage extends MobileBasePage {

    @AndroidFindBy(xpath = "//android.view.View[@index='7']")
    private MobileElement firstButton;

    @AndroidFindBy(xpath = "//android.view.View[@index='10']")
    private MobileElement secondButton;

    @AndroidFindBy(xpath = "//android.view.View[@index='13']")
    private MobileElement thirdButton;

    @AndroidFindBy(xpath = "//android.view.View[@index='16']")
    private MobileElement fourthButton;

    @AndroidFindBy(xpath = "//android.view.View[@index='19']")
    private MobileElement fifthButton;

    @AndroidFindBy(xpath = "//android.view.View[@index='22']")
    private MobileElement sixthButton;

    @AndroidFindBy(xpath = "//android.view.View[@index='25']")
    private MobileElement seventhButton;

    @AndroidFindBy(xpath = "//android.view.View[@index='28']")
    private MobileElement eighthButton;

    @AndroidFindBy(xpath = "//android.view.View[@index='31']")
    private MobileElement ninthButton;

    @AndroidFindBy(xpath = "//android.view.View[@index='34']")
    private MobileElement tenthButton;

    MobileElement[] allButtons = {firstButton, secondButton, thirdButton,
            fourthButton, fifthButton, sixthButton, seventhButton, eighthButton,
            ninthButton, tenthButton};

    @AndroidFindBy(accessibility = "Reset All Filters ")
    private MobileElement resetButton;

    @AndroidFindBy(xpath = "//android.view.View[index='6']//descendant::Button")
    private MobileElement allOptionsButtons;

    public void tapOnAngularButton() {
        tapOn(firstButton);
    }

    public void tapOnResetButton() {
        tapOn(resetButton);
    }

    public boolean allButtonsAreEnabled() {
        return areElementsEnabled(allButtons);
    }
}
