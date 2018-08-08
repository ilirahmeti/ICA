package framework.webPages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By timeMachineButton = By.xpath("//a[contains(text(),'Maps')]");
    private By hours = By.xpath("//div[@class='hours']//span[2]");
    private By timeLineButton = By.xpath("/html[1]/body[1]/div[8]/div[2]/a[1]");
    private By todaysBar = By.xpath("//body[@class='forecast']/div[@id='week']/a[1]/span[3]/span[1]/*[1]");
    private By lowesTempToday = By.xpath("//a[@class='day revealed']//descendant::span[5]");
    private By highesTempToday = By.xpath("//a[@class='day revealed']//descendant::span[3][@class='maxTemp']");
    private By lowesTempTodayExpand = By.xpath("//div[@class='dayDetails revealed']//div[@class='dayExtras']//descendant::span[2][@class='temp']");
    private By highesTempTodayExpand = By.xpath("//div[@class='dayDetails revealed']//div[@class='dayExtras']//descendant::span[6]");
    private By calendarDates = By.xpath("//td[@class='is-today']");

    public String getHomeVerification() {
        return getText(timeMachineButton);
    }

    public boolean timeAddedBy2() {
        return isAddedBy2(hours);
    }

    public void clickOnTodayBar() {
        clickOn(todaysBar);
    }

    public boolean areElementsTempEquals() {
        String low1 = getText(lowesTempToday);
        String high1 = getText(highesTempToday);
        String low2 = getText(lowesTempTodayExpand);
        String high2 = getText(highesTempTodayExpand);

        return areStringsEqual(low1, high1, low2, high2);
    }

    public void clickOnTimelineButton() {

//        scroll();
//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        waitThenClick(timeLineButton);
        clickOn(timeLineButton);
    }

    public boolean theDatesEquals() {
        return dateEquals(calendarDates);
    }

}




