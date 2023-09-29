package COM.CRM.VTiger.practice;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class Write_data_in_csv {
	public static void main(String[] args) throws IOException {
		//write inside any file
		FileWriter f=new FileWriter("./src/test/resources/TestCSV.csv");
		//write inside CSV file
		CSVWriter c=new CSVWriter(f);
		String s[]=new String[3];
		s[0]= "hii";
		s[1]="hlw";
		s[2]="come";
		//to write in next line
		c.writeNext(s);
		//to store inside the cell we use this
		c.flush();
		System.out.println("added");
	}
}
