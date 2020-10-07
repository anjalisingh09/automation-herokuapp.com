package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    protected static WebDriver driver;

    public static WebDriver setInstanceOfDriver(){
        driver = new ChromeDriver();
//        driver = new FirefoxDriver();

        return driver;
    }
}
