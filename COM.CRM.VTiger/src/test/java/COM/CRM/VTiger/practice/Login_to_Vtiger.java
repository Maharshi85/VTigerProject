package COM.CRM.VTiger.practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

public class Login_to_Vtiger {
	public static void main(String[] args) throws IOException, CsvValidationException {
		FileWriter f=new FileWriter("./src/test/resources/TestCSV.csv");
		CSVWriter c=new CSVWriter(f);
		String s[]=new String[2];
		s[0]="admin";
		s[1]="password";
		c.writeNext(s);
		c.flush();
		System.out.println("added");
		try {
			
		FileReader f1=new FileReader("./src/test/resources/TestCSV.csv");
		CSVReader c1=new CSVReader(f1);
		String s1[];
		while((s1=c1.readNext())!=null)
		{
			String uname=s1[0];
			String pwd=s1[1];
			WebDriver dri=new EdgeDriver();
			dri.manage().window().maximize();
			dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			dri.get("http://localhost:8888");
			dri.findElement(By.name("user_name")).sendKeys(uname,Keys.TAB,pwd,Keys.ENTER);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
