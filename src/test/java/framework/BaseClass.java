package framework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.*;

import java.util.logging.Level;

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
            logging(Level.SEVERE, "Exception Thrown :" + noSuchElementException.getMessage());
        } catch (NoSuchFrameException noSuchFrameException) {
            logging(Level.INFO, "Exception Thrown :" + noSuchFrameException.getMessage());
        } catch (NoAlertPresentException noAlertPresentException) {
            logging(Level.WARNING, "Exception Thrown :" + noAlertPresentException.getMessage());
        } catch (ElementNotVisibleException elementNotVisibleException) {
            logging(Level.FINE, "Exception Thrown :" + elementNotVisibleException.getMessage());
        } catch (ElementNotSelectableException elementNotSelectableException) {
            logging(Level.INFO, "Exception Thrown :" + elementNotSelectableException.getMessage());
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
