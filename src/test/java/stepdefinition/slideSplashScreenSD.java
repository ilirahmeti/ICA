package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.mobilePages.SplashScreenPage;
import org.testng.Assert;

public class slideSplashScreenSD {

    SplashScreenPage splashScreenPage = new SplashScreenPage();

    @Given("^I am on Splash screen of the ionic conference app$")
    public void iAmOnSplashScreenPage(){
        Assert.assertTrue(splashScreenPage.isTitleDisplayed(), "Unable to find page title");
    }

    @When("^I swipe right 3 times on tutorials slides$")
    public void swipeRightThreeTimes(){
        splashScreenPage.swipeLeft();
        splashScreenPage.swipeLeft();
        splashScreenPage.swipeLeft();
    }

    @Then("^I verify Continue button is displayed$")
    public void iVerifyContinueIsDispayed(){
        Assert.assertTrue(splashScreenPage.isContinueDisplayed(),"CONTINUE BUTTON IS NOT DISPAYED");
    }

}
