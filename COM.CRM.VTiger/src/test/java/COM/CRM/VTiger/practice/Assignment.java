package COM.CRM.VTiger.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment {
	public static void main(String[] args) {
		WebDriver dri=new EdgeDriver();
		dri.manage().window().maximize();
		dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dri.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		dri.findElement(By.id("onetrust-accept-btn-handler")).click();
		List<WebElement> l=dri.findElements(By.xpath("//div[contains(@class,'Tablestyles__Wrapper-sc')]"));
		for(WebElement w:l)
		{
			System.out.print(w.getText());
		}
		//open flipkart , goto electronics, click on gaming , click on first product, fetch the price
		//save in CSV File.
	}
}
