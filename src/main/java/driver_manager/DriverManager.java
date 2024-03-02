package driver_manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class DriverManager {
    public static WebDriver driver;
    public static WebDriver getDriver() {
        return driver;
    }
    public static void startChrome() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        chromeOptions.addArguments("'--ignore-ssl-errors=yes'");
        chromeOptions.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://egyptlaptop.com/");
        driver.manage().window().maximize();
    }

    public static void startFirefox() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        WebDriverManager.firefoxdriver().setup();
        firefoxOptions.addArguments("'--ignore-ssl-errors=yes'");
        firefoxOptions.addArguments("--ignore-certificate-errors");
        driver = new FirefoxDriver(firefoxOptions);
        driver.get("https://egyptlaptop.com/");
        driver.manage().window().maximize();
    }


    public static void initialize(String browser) {
        if (browser.equalsIgnoreCase("firefox")){
            startFirefox();
        }
        else if(browser.equalsIgnoreCase("chrome")){
            startChrome();
        }
    }

    public static void tearDown() {
        driver.quit();
    }

}
