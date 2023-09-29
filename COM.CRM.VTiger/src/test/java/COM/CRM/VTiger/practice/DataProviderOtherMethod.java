package COM.CRM.VTiger.practice;

import org.testng.annotations.DataProvider;

public class DataProviderOtherMethod {

	@DataProvider()
	public Object[][] data()
	{
		Object[][] da=new Object[2][2];
		da[0][0]="hell";
		da[0][1]=10;
		da[1][0]="hii";
		da[1][1]=12;
		return da;
	}
}
