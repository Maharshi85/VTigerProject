package COM.CRM.VTiger.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelsheetPractice {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f=new FileInputStream("./src/test/resources/Workbook.xlsx");
		Workbook w=WorkbookFactory.create(f);
		Sheet s=w.getSheet("Sheet1");
		Row r=s.getRow(0);
		Cell c=r.getCell(0);
		System.out.println(c.getStringCellValue());
		//goto olympics.com/en/olympic-games/tokyo-2020/medals  fetch country name with medals.
	}
}
