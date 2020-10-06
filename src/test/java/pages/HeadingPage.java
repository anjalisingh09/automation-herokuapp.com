package pages;

import framework.LoggerClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class HeadingPage extends LoggerClass {

    @FindBy(css = "h1.heading")
    WebElement heading;


    @FindBy(css = "a[href='/add_remove_elements/']")
    WebElement addOrRemove;

    @FindBy(css = "div.example")
    WebElement addElement;

    @FindBy(css = "h3")
    WebElement addRemoveHeading;

    @FindBy(css = "button.added-manually")
    List<WebElement> deleteElement;

    public HeadingPage() {
        PageFactory.initElements(driver, this);
    }

    public String displayHeading() {
        return heading.getText();
    }


    public String addOrRemoveElement(){
        addOrRemove.click();
//         addElement.click();
//        deleteElement.get(0).click();

        return addRemoveHeading.getText();
    }
}
