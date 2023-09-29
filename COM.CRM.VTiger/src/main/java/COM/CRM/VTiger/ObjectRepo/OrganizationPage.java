package COM.CRM.VTiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	
	@FindBy(xpath="//img[contains(@title,'Organization...')]")private WebElement lookup;
	
	public OrganizationPage(WebDriver dri)
	{
		PageFactory.initElements(dri,this);
	}
	
	public void clickOrg()
	{
		lookup.click();
	}
}
