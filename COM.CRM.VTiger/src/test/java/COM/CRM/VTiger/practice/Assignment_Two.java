package COM.CRM.VTiger.practice;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import com.opencsv.CSVWriter;

public class Assignment_Two {
	public static void main(String[] args) throws Throwable {
		WebDriver dri=new EdgeDriver();
		dri.manage().window().maximize();
		dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dri.get("https://www.flipkart.com/");
		try
		{
			dri.findElement(By.xpath("//button[text()='✕']")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		WebElement w= dri.findElement(By.xpath("//div[text()='Electronics']"));
		Actions a=new Actions(dri);
		a.moveToElement(w).perform();
		dri.findElement(By.linkText("Gaming")).click();
		dri.findElement(By.cssSelector("[data-id='ACCFHC7ZXDVPSZZM']")).click();
		String s=dri.getWindowHandle();
		Set<String> s1=dri.getWindowHandles();
		for(String s2:s1)
		{
			if(!(s.equals(s2)))
			{
				dri.switchTo().window(s2);
			}
		}
		String price=dri.findElement(By.xpath("(//div[contains(@class,'YokD')])[position()=3]//div[@class='_30jeq3 _16Jk6d']")).getText();
		System.out.println(price);
		FileWriter f=new FileWriter("./src/test/resources/CSV2File.csv");
		CSVWriter c=new CSVWriter(f);
		String arr[]=new String[3];
		arr[0]=price;
		c.writeNext(arr);
		c.flush();
		System.out.println("done");
	}
}
