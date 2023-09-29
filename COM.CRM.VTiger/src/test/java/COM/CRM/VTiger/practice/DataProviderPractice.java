package COM.CRM.VTiger.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {

//	@Test(dataProvider = "data")
//	public void dataFetch(String name,int dat,String nametwo,int dattwo)
//	{
//		System.out.println(name+" "+dat+" "+nametwo+" "+dattwo);
//	}
	@DataProvider
	public Object[][] data()
	{
		Object[][] ob=new Object[3][4];
		ob[0][0]="hell";
		ob[0][1]=10;
		ob[0][2]="hii";
		ob[0][3]=77;
		ob[1][0]="hell";
		ob[1][1]=123;
		ob[1][2]="hii";
		ob[1][3]=11;
		ob[2][0]="hell";
		ob[2][1]=123;
		ob[2][2]="hii";
		ob[2][3]=11;
		
		return ob;
	}
	
}
