package COM.CRM.VTiger.practice;

import java.io.IOException;

import COM.CRM.VTiger.GenericUtilities.ExcelFileUtility;

public class PracticeGenericUtility {
	public static void main(String[] args) throws IOException, Throwable {
		ExcelFileUtility e=new ExcelFileUtility();
		System.out.println(e.dataFromExcelUtility("Sheet1", 0, 0));
	}
}
