package scenario2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactPageTest extends BaseTest {

	
	private final String baseURL = "https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/";

    @Test
    public void testContactPage() {
        // Navigate to the URL
        driver.get(baseURL);

        // Verify the Title
        Assert.assertEquals(driver.getTitle(), "Title of the Page");
	
        contactPage.fillContactForm("Shailaja", "shailaja@gmail.com", "This is a test comment");

        // Verify the "Message Sent" message
        Assert.assertTrue(contactPage.isMessageSentDisplayed());
    }
	
	
	
	
	
}
