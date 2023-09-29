package COM.CRM.VTiger.practice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dri=new EdgeDriver();
		dri.manage().window().maximize();
		dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dri.get("file:///C:/Users/HP/Desktop/uploaddemo.html");
		WebElement w=dri.findElement(By.xpath("//input[@type='file']"));
		JavascriptExecutor j=(JavascriptExecutor)dri;
		j.executeScript("arguments[0].click();",w);
		//it is a relative path
		File f=new File("./src/test/resources/IMG_20221206_102058_841.jpg");
		//to convert relative to absolute
		String x=f.getAbsolutePath();
		w.sendKeys(x);
	}
}
