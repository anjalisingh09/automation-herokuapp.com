package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    static WebDriver driver;

    public static WebDriver setInstanceOfDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver = new FirefoxDriver();

        return driver;
    }
}
