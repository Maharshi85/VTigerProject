package COM.CRM.VTiger.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyfilePractice {
	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("./src/test/resources/CommonData.properties");
		Properties p=new Properties();
		p.load(f);
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("url"));
	}
}
