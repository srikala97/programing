package scenario2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage {

	private WebDriverWait wait;

    @FindBy(id = "name")
    private WebElement nameInput;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "comment")
    private WebElement commentInput;

    @FindBy(id = "submit")
    private WebElement submitButton;
	
    @FindBy(id = "message-sent")
    private WebElement messageSentText;

    public ContactPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 60);
    }

    public void fillContactForm(String name, String email, String comment) {
        nameInput.sendKeys(name);
        emailInput.sendKeys(email);
        commentInput.sendKeys(comment);
        submitButton.click();
    }
    
    public boolean isMessageSentDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(messageSentText));
        return messageSentText.isDisplayed();
    }
	
	
}
