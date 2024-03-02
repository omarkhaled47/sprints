package assertions;

import actions.Actions;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Assertions {

    public static void elementExists(By by) {
        Assert.assertTrue(Actions.elementExists(by));
    }

    public static void assertTwoStrings(String expectedText, By by) {
        Assert.assertEquals(expectedText,Actions.getElementText(by));
    }
}
