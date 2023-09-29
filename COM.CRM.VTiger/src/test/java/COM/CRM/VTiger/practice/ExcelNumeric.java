package COM.CRM.VTiger.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelNumeric {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f=new FileInputStream("./src/test/resources/Workbook2.xlsx");
		Workbook w=WorkbookFactory.create(f);
		//Approach-01(by using " ' ")
		//Sheet s=w.getSheet("Sheet1");
		//System.out.println(s.getRow(0).getCell(0).getStringCellValue());
		
		//Approach-02
		//Sheet s=w.getSheet("Sheet2");
		//System.out.println(s.getRow(0).getCell(0).toString());
	
		//Approach-03
		DataFormatter d=new DataFormatter();
		System.out.println(d.formatCellValue(w.getSheet("Sheet2").getRow(0).getCell(0)));
	}
}
