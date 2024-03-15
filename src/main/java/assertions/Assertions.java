package assertions;

import actions.Actions;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Assertions {

    public static void elementExists(By by) {
        Assert.assertTrue(Actions.elementExists(by));
    }

    public static void assertTwoStrings(String expectedText, By by) {
        Assert.assertEquals(expectedText,Actions.getElementText(by));
    }
}
