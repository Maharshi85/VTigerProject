package COM.CRM.VTiger.practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prctice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//search mic test and click on Test Webcam , the click on Test my cam, handle pop-up
				ChromeOptions c=new ChromeOptions();
				c.addArguments("use-fake-device-for-media-stream");
				c.addArguments("use-fake-ui-for-media-stream");
				WebDriver dri=new ChromeDriver(c);
				dri.manage().window().maximize();
				dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				dri.get("https://mictests.com/");
				dri.findElement(By.linkText("Test Webcam")).click();
				String s=dri.getWindowHandle();
				Set<String> s1=dri.getWindowHandles();
				for(String s2:s1)
				{
					if(!(s.equals(s2)))
					{
						dri.switchTo().window(s2);
					}
				}
				dri.findElement(By.id("webcam-launcher")).click();
		//WebDriverWait w=new WebDriverWait(dri,Duration.ofSeconds(10));
		//System.out.println(w.until(ExpectedConditions.alertIsPresent()));
		//goto amazon then fetch all the links print all the links 1st column of excel sheet.
	}

}
