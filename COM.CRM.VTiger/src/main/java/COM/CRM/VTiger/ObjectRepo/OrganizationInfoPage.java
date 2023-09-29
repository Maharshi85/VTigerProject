package COM.CRM.VTiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfoPage {

	@FindBy(className = "dvHeaderText") private WebElement orghead;
	
	public OrganizationInfoPage(WebDriver dri)
	{
		PageFactory.initElements(dri,this);
	}
	
	public String oragHead()
	{
		return orghead.getText();
	}
}
