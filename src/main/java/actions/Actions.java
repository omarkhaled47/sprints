package actions;

import driver_manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Actions {
    private static final Duration DEFAULT_WAIT_TIME = Duration.ofSeconds(30);
    public static WebElement waitForElement(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), DEFAULT_WAIT_TIME);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public static void type(String text, By by) {
        WebElement element = waitForElement(by);
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    public static void click(By by) {
        WebElement element = waitForElement(by);
        element.click();
    }

    public static boolean elementExists(By by) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), DEFAULT_WAIT_TIME);
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (Exception e) {
            return false;
        }
        return by != null;
    }

    public static String getElementText(By by) {
        WebElement element = DriverManager.getDriver().findElement(by);
        return element.getText();
    }
}
