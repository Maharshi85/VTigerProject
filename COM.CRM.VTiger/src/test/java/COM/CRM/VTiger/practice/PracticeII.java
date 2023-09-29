package COM.CRM.VTiger.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PracticeII {
	public static void main(String[] args) throws FileNotFoundException {
		WebDriver dri=new EdgeDriver();
		dri.manage().window().maximize();
		dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dri.get("https://www.amazon.in");
		List<WebElement> l=dri.findElements(By.xpath("//a"));
		ArrayList<String> a=new ArrayList<String>();
		for(int i=0;i<l.size();i++)
		{
			String s=l.get(i).getAttribute("href");
			int code=0;
			try {
				URL u=new URL(s);
				URLConnection u1=u.openConnection();
				HttpsURLConnection h=(HttpsURLConnection)u1;
				code=h.getResponseCode();
				if(code>=400)
				{
					a.add(s+" "+code);
				}
			} catch (Exception e) {
				// TODO: handle exception
				continue;
			}
			System.out.println(a);
		}
		
	}
}
