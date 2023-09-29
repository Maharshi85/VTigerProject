package COM.CRM.VTiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

	@FindBy(xpath = "//img[contains(@title,'Contact...')]") private WebElement contact;
	
	public ContactPage(WebDriver dri)
	{
		PageFactory.initElements(dri,this);
	}
	
	public void contactClick()
	{
		contact.click();
	}
}
