package framework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.*;

import java.util.logging.Level;

import static framework.Driver.setInstanceOfDriver;

public class BaseClass extends LoggerClass{

    @BeforeAll
    public void setup(){
        driver = setInstanceOfDriver();
        try {
            driver = setInstanceOfDriver();
            logger = setInstanceOfLogger();
            getUrl();
        }
        catch (NoSuchElementException noSuchElementException) {
            logging(Level.SEVERE, "Exception is No Such Element Exception");
        } catch (NoSuchFrameException e) {
            logging(Level.INFO, "Exception is No Such Frame Exception");
        } catch (NoAlertPresentException e) {
            logging(Level.WARNING, "Exception is No Alert Present Exception");
        } catch (ElementNotVisibleException e) {
            logging(Level.FINE, "Exception is Element Not Visible Exception");
        } catch (ElementNotSelectableException e) {
            logging(Level.INFO, "Exception is Element Not Selectable Exception");
        } catch (Exception exception) {
            logging(Level.INFO, "Exception Thrown :" + exception.getMessage());
        }
    }

    private static void getUrl() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterAll
    public static void tearDown(){
        driver.close();
    }
}
