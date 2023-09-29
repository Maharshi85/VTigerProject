package COM.CRM.VTiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import COM.CRM.VTiger.GenericUtilities.WebdriverUtility;

public class HomePage extends WebdriverUtility{
	
	@FindBy(linkText = "Contacts") private WebElement orglink;
	
	@FindBy(xpath="//td[@class='tabUnSelected']//a[text()='Organizations']") private WebElement organization;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']") private WebElement signimg;
	
	@FindBy(xpath="//a[contains(text(),'Sign')]") private WebElement signout;
	
	public HomePage(WebDriver dri)
	{
		PageFactory.initElements(dri,this);
	}
	
	public void clickOrganization()
	{
		organization.click();
	}
	
	public void clickContacts()
	{
		orglink.click();
	}
	
	public void logoutApp(WebDriver dri)
	{
		moveToElement(dri, signimg);
		signout.click();
	}
}
