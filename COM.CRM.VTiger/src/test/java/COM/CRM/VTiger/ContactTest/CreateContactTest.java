package COM.CRM.VTiger.ContactTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import COM.CRM.VTiger.GenericUtilities.BaseClass;
import COM.CRM.VTiger.GenericUtilities.ExcelFileUtility;
import COM.CRM.VTiger.GenericUtilities.FileUtility;
import COM.CRM.VTiger.GenericUtilities.JavaUtility;
import COM.CRM.VTiger.GenericUtilities.WebdriverUtility;
import COM.CRM.VTiger.ObjectRepo.ContactHeaderPage;
import COM.CRM.VTiger.ObjectRepo.ContactInfoPage;
import COM.CRM.VTiger.ObjectRepo.ContactPage;
import COM.CRM.VTiger.ObjectRepo.HomePage;
import COM.CRM.VTiger.ObjectRepo.LoginPage;

public class CreateContactTest extends BaseClass{
	
	@Test(groups = "Smokesuite")
	public  void verifyUserCreateContactTest()throws Throwable {
		
		ExcelFileUtility e=new ExcelFileUtility();
		JavaUtility j=new JavaUtility();
		WebdriverUtility web=new WebdriverUtility();
		String name=e.dataFromExcelUtility("Sheet1",2, 0)+j.randomNumber();
		//click on contact link
		HomePage h=new HomePage(dri);
		h.clickContacts();
		Reporter.log("clicked on contact",true);
		
		//click on contact look up image
		ContactPage c=new ContactPage(dri);
		c.contactClick();
		Reporter.log("clicked on Look up image",true);
		
		//create contact with mandatory field
		ContactInfoPage con=new ContactInfoPage(dri);
		con.nameInpuMethod(name);
		web.screenShot(dri, "namess");
		
		//fetch the created contact
		ContactHeaderPage head=new ContactHeaderPage(dri);
		String s1=head.headerMethod();
		
		//validate contact created or not
		Assert.assertTrue(s1.contains(name));
		Reporter.log("validation pass",true);
		System.out.println("pass");
	}
	@Test
	public void create()
	{
		System.out.println("Running");
	}
}
