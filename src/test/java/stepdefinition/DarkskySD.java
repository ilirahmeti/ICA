package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.HomePage;
import org.testng.Assert;

public class DarkskySD {
    HomePage homePage = new HomePage();

    @Given("^I am on Darksky home page$")
    public void iAmOnDarskskyHomePage() {
        Assert.assertEquals(homePage.getHomeVerification(), "Maps", "YOU ARE NOT IN THE HOME PAGE");
    }

    @Then("^I verify timeline is displayed with two hours incremented$")
    public void timelieneDisplaysTwoHoursIncrement() {
        Assert.assertEquals(homePage.timeAddedBy2(), true, "THE TIME IS NOT INCREMENTED BY 2 HOUS");
    }

    @When("^I expand todays timeline$")
    public void iExpandTodaysTimeline() {
        homePage.clickOnTodayBar();
    }

    @Then("^I verify lowest and highest temp is displayed correctly$")
    public void verifyTemp() {
        Assert.assertEquals(homePage.areElementsTempEquals(), true, "THE TEMP ELEMENTS ARE NOT EQUAL");

    }

    @When("^I click on Time Machine$")
    public void iclickOnTimeMachine() {
        homePage.clickOnTimelineButton();
    }

    @Then("^I verify date is selected to todays date$")
    public void verifyTodayDateIsSelected() {
        Assert.assertEquals(homePage.theDatesEquals(), true, "THE TODAY DATE DO NOT EQUAL WITH CALENDAR DATE");
    }

}


