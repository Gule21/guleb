package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.PropertiesReadingUtil;
import utilities.WebDriverUtil;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {

    //test base for code reusability
    //use access modifier here
    //in base page we will set up all the utilities
    public WebDriver driver;
    public PropertiesReadingUtil propertiesReadingUtil = new PropertiesReadingUtil();

    public void setup() throws IOException {
        driver= WebDriverUtil.getDriver();

        propertiesReadingUtil.readPropertiesFile();
    }

    public void closing() throws InterruptedException {

         driver.close();
    }
}
