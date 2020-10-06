package pages;

import framework.LoggerClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeadingPage extends LoggerClass {

    @FindBy(css = "h1.heading")
    WebElement heading;

    public HeadingPage() {
        PageFactory.initElements(driver, this);
    }

    public String displayHeading() {
        return heading.getText();
    }
}
