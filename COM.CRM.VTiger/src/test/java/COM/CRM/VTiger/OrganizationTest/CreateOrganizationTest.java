package COM.CRM.VTiger.OrganizationTest;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import COM.CRM.VTiger.GenericUtilities.BaseClass;
import COM.CRM.VTiger.GenericUtilities.ExcelFileUtility;
import COM.CRM.VTiger.GenericUtilities.JavaUtility;
import COM.CRM.VTiger.ObjectRepo.CreateNewOraganizationPage;
import COM.CRM.VTiger.ObjectRepo.HomePage;
import COM.CRM.VTiger.ObjectRepo.OrganizationInfoPage;
import COM.CRM.VTiger.ObjectRepo.OrganizationPage;
@Listeners(COM.CRM.VTiger.GenericUtilities.ListnerImplementation.class)
public class CreateOrganizationTest extends BaseClass{
	@Test(groups = {"Regressionsuite","Regressionsuite"} ,retryAnalyzer = COM.CRM.VTiger.GenericUtilities.RetryAnalyser.class)
	public void verifyUserCreateOrganizationTest() throws Throwable {
		
		ExcelFileUtility e=new ExcelFileUtility();
		JavaUtility j=new JavaUtility();
		String orgname=e.dataFromExcelUtility("Sheet1", 2,0)+j.randomNumber();
		HomePage h=new HomePage(dri);
		h.clickOrganization();
		OrganizationPage o=new OrganizationPage(dri);
		o.clickOrg();
		//Assert.fail();
		CreateNewOraganizationPage c=new CreateNewOraganizationPage(dri);
		c.nameMethod(orgname);
		OrganizationInfoPage or=new OrganizationInfoPage(dri);
		String s=or.oragHead();
		Assert.assertTrue(s.contains(orgname));
		System.out.println("pass");
	}
}
