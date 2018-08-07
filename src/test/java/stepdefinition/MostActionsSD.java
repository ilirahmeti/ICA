package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.FilterPage;
import framework.LandingPage;
import framework.SplashScreenPage;
import org.testng.Assert;
public class MostActionsSD {

    LandingPage landingPage = new LandingPage();
    SplashScreenPage splashScreenPage = new SplashScreenPage();
    FilterPage filterPage = new FilterPage();

    @Given("^I am on a splash page of the app$")
    public void iAmOnsplashPage(){
        Assert.assertTrue(splashScreenPage.isTitleDisplayed(), "Unable to find page title");
    }

    @When("^I click on Skip button on splash screen$")
    public void clickOnSkip() {
        splashScreenPage.clickOnSkip();
    }

    @When("^Search for \"(.+)\"$")
    public void searchForBreakfast(String enteredValueFromFeatureFile){
        landingPage.serchText(enteredValueFromFeatureFile);
    }

        @Then("^I verify Event displayed with header, Duration, description$")
    public void iVerifyEventDisplayed(){
        Assert.assertEquals(landingPage.getBreakfastText(),"Breakfast","THE BREAKFAST EVENT VARIFICATION FAILED");
    }

    @Given("^I am on home page of the app$")
    public void iAmOnHomePage(){
        splashScreenPage.clickOnSkip();
        Assert.assertTrue(landingPage.isBreakfastDisplayed(),"YOU ARE NOT IN THE HOME PAGE");
    }

    @When("^I click on filter button$")
    public void iClickOnFilterButon(){
       landingPage.tapOnFilterButton();
    }

    @When("^I disable \"(.+)\" option")
    public void iDisableAngularButton(String angularButton){
        filterPage.tapOnAngularButton();
    }

    @When("^I click on All Reset Filer button$")
    public void clickOnResetButton(){
       filterPage.tapOnResetButton();
    }

    @Then("^I verify all options are enabled$")
    public void allOptionsAreEnabled(){
       Assert.assertTrue(filterPage.allButtonsAreEnabled(),"ALL BUTTONS ARE NOT UNABLED");
    }

    @When("^I click on hamburger menu$")
    public void clickOnHamburgerMenu(){
        landingPage.tapOnMenuButton();
    }

    @Then("^I verify default main menu bar fields$")
    public void verifyDefaultMenuBarFields(){
         Assert.assertTrue(landingPage.allfieldsAreDisplayed(),"ALL FIELDS ARE NOT DISPLAYED");
    }
}

