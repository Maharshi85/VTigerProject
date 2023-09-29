package COM.CRM.VTiger.GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelFileUtility {
/**
 * Here we want to fetch,update or delete the data from Excel Sheet
 * @author Maharshi
 * @param sheetname
 * @param rownum
 * @param cellnum
 * @return
 * @throws Throwable
 * @throws IOException
 */
	public String dataFromExcelUtility(String sheetname,int rownum,int cellnum) throws Throwable, IOException
	{
		FileInputStream f=new FileInputStream(Ipathconstant.excelfilepath);
		Workbook w=WorkbookFactory.create(f);
		String s=w.getSheet(sheetname).getRow(rownum).getCell(cellnum).toString();
		return s;
	}
	public void updateExcelSheet(String sheetname,int rownum,int cellnum,String data) throws Throwable
	{
		FileInputStream f=new FileInputStream(Ipathconstant.excelfilepath);
		Workbook w=WorkbookFactory.create(f);
		w.getSheet(sheetname).createRow(rownum).createCell(cellnum).setCellValue(data);
		FileOutputStream f1=new FileOutputStream(Ipathconstant.excelfilepath);
		w.write(f1);
	}
	
	@DataProvider
	public Object[][] multipleData() throws Throwable
	{
		FileInputStream f=new FileInputStream(Ipathconstant.excelfilepath);
		Sheet s=WorkbookFactory.create(f).getSheet("Sheet2");
		int row=s.getLastRowNum()+1;
		int cell=s.getRow(0).getLastCellNum();
		Object[][] ob=new Object[row][cell];
		DataFormatter da=new DataFormatter();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<cell;j++)
			{
				ob[i][j]=da.formatCellValue(s.getRow(i).getCell(j));
			}
		}
		return ob;
	}
}
