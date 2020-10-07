package pages;
import framework.LoggerClass;
import framework.Wait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;
public class HeadingPage extends LoggerClass {
    @FindBy(css = "h1.heading")
    WebElement heading;
    
    @FindBy(css = "a[href='/add_remove_elements/']")
    WebElement addOrRemove;
    
    @FindBy(xpath = "//*[@id=\"content\"]/div/button")
    WebElement addElement;
    
    @FindBy(css = "h3")
    WebElement addRemoveHeading;
    
    @FindBy(css = "button.added-manually")
    List<WebElement> deleteElement;
    
    public HeadingPage() {
        PageFactory.initElements(driver, this);
    }
    public String displayHeading() {
        Wait.explicitWait(ExpectedConditions.visibilityOf(heading));
        return heading.getText();
    }
    public String addOrRemoveElement(){
        Wait.explicitWait(ExpectedConditions.elementToBeClickable(addOrRemove));
        addOrRemove.click();
        Wait.explicitWait(ExpectedConditions.elementToBeClickable(addElement));
        addElement.click();
        Wait.explicitWait(ExpectedConditions.elementToBeClickable(addElement));
        addElement.click();
        Wait.explicitWait(ExpectedConditions.elementToBeClickable(deleteElement.get(0)));
        deleteElement.get(0).click();
        
        return addRemoveHeading.getText();
    }
}
