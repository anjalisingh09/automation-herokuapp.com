package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    protected static WebDriver driver;

    public static WebDriver setInstanceOfDriver(){
        driver = new ChromeDriver();

        return driver;
    }
}
