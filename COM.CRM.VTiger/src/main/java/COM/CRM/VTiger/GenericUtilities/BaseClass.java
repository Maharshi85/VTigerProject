package COM.CRM.VTiger.GenericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import COM.CRM.VTiger.ObjectRepo.HomePage;
import COM.CRM.VTiger.ObjectRepo.LoginPage;

public class BaseClass {

	public WebDriver dri;
	public static WebDriver listnerdri;
	public FileUtility f=new FileUtility();
	public WebdriverUtility web=new WebdriverUtility();
	
	@BeforeSuite(groups = {"Smokesuite","Regressionsuite"})
	public void dbConfig()
	{
		System.out.println("connected");
	}
	
	//@Parameters("browser")
	@BeforeClass(groups = {"Smokesuite","Regressionsuite"})
	public void launchBrowser(/*String browser*/) throws Throwable
	{
		String browser=f.dataFromPropertyFile("browser");
		//String browser=System.getProperty("browser");
		
				if(browser.equalsIgnoreCase("chrome"))
				{
					dri=new ChromeDriver();
				}
				else if(browser.equalsIgnoreCase("firefox"))
				{
					dri=new FirefoxDriver();
				}
				else
					dri=new EdgeDriver();
					//System.out.println("don't worry");
		listnerdri=dri;		
		web.maximize(dri);
		web.implicitWait(dri);
		dri.get(f.dataFromPropertyFile("url"));
	}
	
	@BeforeMethod(groups = {"Smokesuite","Regressionsuite"})
	public void loginPage() throws Throwable
	{
		LoginPage l=new LoginPage(dri);
		l.unameMethod(f.dataFromPropertyFile("username"));
		l.pwdMethod(f.dataFromPropertyFile("password"));
	}
	
	@AfterMethod(groups = {"Smokesuite","Regressionsuite"})
	public void logoutPage()
	{
		HomePage h=new HomePage(dri);
		h.logoutApp(dri);
	}
	
	@AfterClass(groups = {"Smokesuite","Regressionsuite"})
	public void closeBrowser()
	{
		dri.quit();
	}
	
	@AfterSuite(groups = {"Smokesuite","Regressionsuite"})
	public void dbConfigClose()
	{
		System.out.println("Succesfully Dissconnected");
	}
}
