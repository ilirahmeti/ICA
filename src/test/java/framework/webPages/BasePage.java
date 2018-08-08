package framework.webPages;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import utility.AllureUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import stepdefinition.SharedSD;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasePage extends SharedSD {

    public static void clickOn(By locator) {
        try {
            browser(locator).click();
        } catch (Exception e) {
            AllureUtil.takeMobileScreenshot();
            e.printStackTrace();
        }
    }

    public static String getText(By locator) {
        String text = null;
        try {
          text = browser(locator).getText();
        } catch (Exception e) {
            AllureUtil.takeMobileScreenshot();
            e.printStackTrace();
        }
        return text;
    }

    public static WebElement browser(final By locator) {
        Wait<WebDriver> wait = new FluentWait<>(SharedSD.getDriver())
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(1, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementNotFoundException.class)
                .withMessage("Webdriver waited for 30 seconds but still could not find the element" +
                        " therefore Timeout Exception has been thrown");

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
        return element;
    }

    public static boolean isAddedBy2(By locator) {
        List<WebElement> links = SharedSD.getDriver().findElements(locator);
        for (int i = 0; i < links.size(); i++) {
            Pattern p = Pattern.compile("[0-9]");
            Matcher m = p.matcher(links.get(i).getText());
            while (m.find()) {
                int n = Integer.parseInt(m.group());
                if (isOdd(n)) {
                    if ((n % 2 != 1)) {
                        return false;
                    }
                } else {
                    if ((n % 2 != 0)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isOdd(int x) {

        for (int i = 1; i <= x; i += 2) {
            if (x == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean areStringsEqual(String low1, String high1, String low2, String high2) {
        if (low1.equals(low2) && high1.equals(high2)) {
            return true;
        }
        return false;
    }

    public boolean dateEquals(By locator) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 0);
        Date date = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("d");
        String todayDate = sdf.format(date);

        String calendarDate = browser(locator).getAttribute("textContent");

        if (calendarDate.equals(todayDate)) {
            return true;
        } else {
            return false;
        }
    }

}


