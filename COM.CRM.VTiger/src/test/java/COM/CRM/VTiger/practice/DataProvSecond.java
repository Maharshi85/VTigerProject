package COM.CRM.VTiger.practice;

import org.testng.annotations.Test;

public class DataProvSecond {

	@Test(dataProvider = "data" ,dataProviderClass = DataProviderPractice.class)
	public void dataFetch(String name,int dat,String nametwo,int dattwo)
	{
		System.out.println(name+" "+dat+" "+nametwo+" "+dattwo);
	}
}
