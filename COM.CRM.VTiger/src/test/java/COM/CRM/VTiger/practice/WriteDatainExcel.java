package COM.CRM.VTiger.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDatainExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f=new FileInputStream("./src/test/resources/Workbook2.xlsx");
		Workbook w=WorkbookFactory.create(f);
		Sheet s=w.createSheet("Sheet4");
		s.createRow(0).createCell(0).setCellValue("helloworld");
		FileOutputStream f1=new FileOutputStream("./src/test/resources/Workbook2.xlsx");
		w.write(f1);
	}
}
