package COM.CRM.VTiger.practice;

import java.io.IOException;

import COM.CRM.VTiger.GenericUtilities.FileUtility;
import COM.CRM.VTiger.GenericUtilities.JavaUtility;

public class PracticeFileUtility {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileUtility f=new FileUtility();
		System.out.println(f.dataFromPropertyFile("browser"));
		JavaUtility j=new JavaUtility();
		System.out.println(j.getDate());
		System.out.println(j.modifyDate());
	}
}