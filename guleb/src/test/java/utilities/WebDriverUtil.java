package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtil {
    //create  a util that takes browser type and create connection between browser and selenium

    public static WebDriver getDriver() {
        //chrome browser needs to be set up

        WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            return driver;

    }
}
