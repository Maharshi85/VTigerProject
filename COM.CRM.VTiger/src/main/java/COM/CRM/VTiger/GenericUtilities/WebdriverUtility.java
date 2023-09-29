package COM.CRM.VTiger.GenericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebdriverUtility {
/**
 * Here we can maximize the webpage
 * @author Maharshi
 * @param dri
 */
	public void maximize(WebDriver dri)
	{
		dri.manage().window().maximize();
	}
/**\
 * Here we can minimize the webpage
 * @author Maharshi
 * @param dri
 */
	public void minimize(WebDriver dri)
	{
		dri.manage().window().minimize();
	}
/**
 * Here we wait the webpage some period of time
 * @param dri
 */
	public void implicitWait(WebDriver dri)
	{
		dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(Ipathconstant.implicitwaitduration));
	}
/**
 * Here we want to wait the page until element is found.
 * @author Maharshi
 * @param dri
 * @param element
 */
	public void visibilityWait(WebDriver dri,WebElement element)
	{
		WebDriverWait w=new WebDriverWait(dri,Duration.ofSeconds(Ipathconstant.explicitwaitduration));
		w.until(ExpectedConditions.visibilityOf(element));
	}
/**
 * Here we want to wait the webpage until the element is clickable.
 * @author Maharshi
 * @param dri
 * @param element
 */
	public void elementToClickableWait(WebDriver dri,WebElement element)
	{
		WebDriverWait w=new WebDriverWait(dri,Duration.ofSeconds(Ipathconstant.explicitwaitduration));
		w.until(ExpectedConditions.elementToBeClickable(element));
	}
/**
 * Here we want to check the webpage is their AlertPopup is present or not.
 * @author Maharshi
 * @param dri
 */
	public void alertIsPresentWait(WebDriver dri)
	{
		WebDriverWait w=new WebDriverWait(dri,Duration.ofSeconds(Ipathconstant.explicitwaitduration));
		w.until(ExpectedConditions.alertIsPresent());
	}
/**
 * Here we handle the dropdown by using Index value.
 * @author Maharshi
 * @param element
 * @param index
 */
	public void dropDown(WebElement element,int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}
/**
 * Here we handle the dropdown by using Value.
 * @author Maharshi
 * @param element
 * @param value
 */
	public void dropDown(WebElement element,String value)
	{
		Select s=new Select(element);
		s.selectByValue(value);
	}
/**
 * Here we handle the dropdown by using visibleText.
 * @author Maharshi
 * @param text
 * @param element
 */
	public void dropDown(String text,WebElement element)
	{
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
/**
 * Here we handle the alert pop-up and click on Ok button by using accept method.
 * @author Maharshi
 * @param dri
 */
	public void acceptAlertPopup(WebDriver dri)
	{
		dri.switchTo().alert().accept();
	}
/**
 * Here we handle the alert pop-up and click on cancle button by using dismiss method.
 * @author Maharshi
 * @param dri
 */
	public void dismissAlertPopup(WebDriver dri)
	{
		dri.switchTo().alert().dismiss();;
	}
/**
 * Here we handle the alert pop-up and getting text by using the text method.
 * @author Maharshi
 * @param dri
 * @return
 */
	public String textAlertPopup(WebDriver dri)
	{
		return dri.switchTo().alert().getText();
	}
/**
 * Here we handle the alert pop-up and pass the message by using sendkeys method.
 * @author Maharshi
 * @param dri
 * @param message
 */
	public void sendmsgAlertPopup(WebDriver dri,String message)
	{
		dri.switchTo().alert().sendKeys(message);
	}
/**
 * Here we switch to one frame to another frame by using Index value(Handle Frame).
 * @author Maharshi
 * @param dri
 * @param index
 */
	public void frameByIndex(WebDriver dri,int index)
	{
		dri.switchTo().frame(index);
	}
/**
 * Here we switch to one frame to another frame by using Id or Name(Handle Frame).
 * @author Maharshi
 * @param dri
 * @param idorname
 */
	public void frameById(WebDriver dri,String idorname)
	{
		dri.switchTo().frame(idorname);
	}
/**
 * Here we switch to one frame to another frame by using the WebElement()Handle Frame.
 * @author Maharshi
 * @param dri
 * @param element
 */
	public void frameByWebelement(WebDriver dri,WebElement element)
	{
		dri.switchTo().frame(element);
	}
/**
 * Here we switch child frame to immediate parent frame.
 * @author Maharshi
 * @param dri
 */
	public void parentFrame(WebDriver dri)
	{
		dri.switchTo().parentFrame();
	}
/**
 * Here we switch from any child to main parent frame.
 * @author Maharshi
 * @param dri
 */
	public void defaultFrame(WebDriver dri)
	{
		dri.switchTo().defaultContent();
	}
/**
 * Here we move the cursor from one place to another place by using moveToElement method.
 * @author Maharshi
 * @param dri
 * @param element
 */
	public void moveToElement(WebDriver dri,WebElement element)
	{
		Actions a=new Actions(dri);
		a.moveToElement(element).perform();
	}
/**
 * Here we right click on an element by using contextClick method.
 * @author Maharshi
 * @param dri
 * @param element
 */
	public void rightClick(WebDriver dri,WebElement element)
	{
		Actions a=new Actions(dri);
		a.contextClick(element).perform();
	}
/**
 * Here we right click anywhere by using contextClick method.
 * @author Maharshi
 * @param dri
 */
	public void rightClickAnywhere(WebDriver dri)
	{
		Actions a=new Actions(dri);
		a.contextClick().perform();
	}
/**
 * Here we can do double click anywhere by using doubleClick method.
 * @author Maharshi
 * @param dri
 */
	public void doubleClickAnywhere(WebDriver dri)
	{
		Actions a=new Actions(dri);
		a.doubleClick().perform();
	}
/**
 * Here we do the double click on an element by using doubleClick method.
 * @author Maharshi
 * @param dri
 * @param element
 */
	public void doubleClick(WebDriver dri,WebElement element)
	{
		Actions a=new Actions(dri);
		a.doubleClick(element).perform();
	}
/**
 * Here we drag an element from source and drop it in destination by using dragAndDrop method.
 * @author Maharshi 
 * @param dri
 * @param src
 * @param dst
 */
	public void dragAndDrop(WebDriver dri,WebElement src,WebElement dst)
	{
		Actions a=new Actions(dri);
		a.dragAndDrop(src, dst).perform();
	}
/**
 * Here we can switch from one window to another window by using getWindowHandles method and title.
 * @author Maharshi
 * @param dri
 * @param partialtitle
 */
	public void windowHandles(WebDriver dri,String partialtitle)
	{
		//capture all the ids
		Set<String> id=dri.getWindowHandles();
		//navigate to each window
		for(String wnd:id)
		{
			String currenturl=dri.switchTo().window(wnd).getTitle();
			if(currenturl.contains(partialtitle))
			{
				break;
			}
		}
	}
/**
 * Here we taking screenshot of an webpage by using getScreenShot method.
 * @author Maharshi
 * @param dri
 * @param screenshotname
 * @return
 * @throws IOException
 */
	public String screenShot(WebDriver dri,String screenshotname) throws IOException
	{
		TakesScreenshot t=(TakesScreenshot)dri;
		File f=t.getScreenshotAs(OutputType.FILE);
		
		JavaUtility j=new JavaUtility();
		String currentdate=j.modifyDate();
		
		File f1=new File("./Screenshot/"+currentdate+screenshotname+".png");
		
		FileHandler.copy(f, f1);
		return f1.getAbsolutePath();
	}
/**
 * Here we taking screenshot of an element.
 * @author Maharshi
 * @param element
 * @param screenshotname
 * @return
 * @throws IOException
 */
	public String screenShotElement(WebElement element,String screenshotname) throws IOException
	{
		TakesScreenshot t=(TakesScreenshot)element;
		File src=t.getScreenshotAs(OutputType.FILE);
		
		JavaUtility j=new JavaUtility();
		String currentdate=j.modifyDate();
		
		File dst=new File("./Screenshot/"+currentdate+screenshotname+".png");
		
		FileHandler.copy(src,dst);
		return dst.getAbsolutePath();
	}
/**
 * Here we uploading file by using the File Class and sendKeys method.
 * @author Maharshi
 * @param path
 * @param element
 */
	public void fileUpload(String path,WebElement element)
	{
		File f=new File(path);
		String abspath=f.getAbsolutePath();
		element.sendKeys(abspath);
	}
/**
 * Here we scroll the webpage by using executeScript method.
 * @author Maharshi
 * @param dri
 */
	public void scrollByWebpage(WebDriver dri)
	{
		JavascriptExecutor j=(JavascriptExecutor)dri;
		j.executeScript("window.scrollBy(0,500);");
	}
/**
 * Here we scroll the webpage upto the element where it is present.
 * @author Maharshi
 * @param dri
 * @param element
 */
	public void scrollByWebElement(WebDriver dri,WebElement element)
	{
		JavascriptExecutor j=(JavascriptExecutor)dri;
		int y=element.getLocation().getY();
		j.executeScript("window.scrollBy(0,"+y+");",element);
	}
}
