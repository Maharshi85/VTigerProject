package COM.CRM.VTiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Identify the element using Selenium annotation and make the element as Private
	@FindBy(name="user_name") private WebElement useranme;
	
	@FindBy(css="[type='password']") private WebElement password;
	
	@FindBy(id="submitButton") private WebElement loginbutt;
	
	//Initialise the Elements, PageFactory class will handle StaleElementRefernceException  
	public LoginPage(WebDriver dri)
	{
		PageFactory.initElements(dri,this);
	}
	
	//Creating business libraries(generic methods) for reducing the code
	public void unameMethod(String un)
	{
		useranme.sendKeys(un);
	}
	public void pwdMethod(String pwd)
	{
		password.sendKeys(pwd);
		loginbutt.click();
	}
}
