package COM.CRM.VTiger.practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartAssignment {

	public static void main(String[] args) {
		WebDriver dri=new EdgeDriver();
		dri.manage().window().maximize();
		dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dri.get("https://www.flipkart.com");
		WebElement webe=dri.findElement(By.xpath("//button[text()='✕']"));
		//boolean t=true;
			if(webe.isDisplayed())
			{
				dri.findElement(By.xpath("//button[text()='✕']")).click();
			}
			else
			{
				dri.findElement(By.xpath("//span[text()='✕']")).click();
			}
		WebElement w=dri.findElement(By.xpath("//div[text()='Electronics']"));
		Actions a=new Actions(dri);
		a.moveToElement(w).perform();
		WebElement web=dri.findElement(By.linkText("Gaming"));
		a.moveToElement(web).perform();
		dri.findElement(By.linkText("Gamepads")).click();
		dri.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
		dri.findElement(By.xpath("//div[contains(@data-id,'GZZPZXHW')]")).click();
		String win=dri.getWindowHandle();
		Set<String> wins=dri.getWindowHandles();
		for(String st:wins)
		{
			if(!(st.equals(win)))
			{
				dri.switchTo().window(st);
			}
		}
		String s=dri.findElement(By.xpath("//div[contains(@class,'jeq')]")).getText();
		System.out.println(s);
		dri.findElement(By.cssSelector("[class*=_Dny]")).click();
		dri.findElement(By.xpath("//span[text()='COMPARE']")).click();
		String name=dri.findElement(By.xpath("//div[contains(@class,'jeq')]")).getText();
		System.out.println(name);
		if(name.endsWith(s))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
