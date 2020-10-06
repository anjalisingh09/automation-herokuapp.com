package framework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseClass extends Driver{

    @BeforeAll
    public static void setup(){
        driver = setInstanceOfDriver();
        getUrl();
    }

    private static void getUrl() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterAll
    public static void tearDown(){
        driver.close();
    }
}
