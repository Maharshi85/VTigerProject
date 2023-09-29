package COM.CRM.VTiger.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class Read_data_from_csv {

	public static void main(String[] args) throws FileNotFoundException, CsvValidationException {
		// TODO Auto-generated method stub
		try {
		//to read the data from any file
		FileReader f=new FileReader("./src/test/resources/TestCSV.csv");
		//to read the data from csv file
		CSVReader rea=new CSVReader(f);
		String cell[];
		while((cell=rea.readNext())!=null)
		{
			String username=cell[0];
			String password=cell[1];
			System.out.println(username+" "+password);
			WebDriver dri=new EdgeDriver();
			dri.manage().window().maximize();
			dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			dri.get("http://localhost:8888");
			dri.findElement(By.name("user_name")).sendKeys(username,Keys.TAB,password,Keys.ENTER);
		}
		
		}
		catch(IOException e)
		{
			e.printStackTrace();
			//System.out.println("Sorry");
		}
	}

}
