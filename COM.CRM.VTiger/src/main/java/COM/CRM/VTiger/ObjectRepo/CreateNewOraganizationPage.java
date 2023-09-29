package COM.CRM.VTiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOraganizationPage {
	
	@FindBy(css="[name='accountname']")private WebElement name;
	
	@FindBy(css=".crmbutton.small.save")private WebElement saveclick;
	
	public CreateNewOraganizationPage(WebDriver dri)
	{
		PageFactory.initElements(dri,this);
	}
	
	public void nameMethod(String nam)
	{
		name.sendKeys(nam);
		saveclick.click();
	}
}
