package pom.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pom.qa.pages.Find_Leads_Page;
import pom.qa.pages.Home_Page_1;
import pom.qa.pages.Home_Page_2;
import pom.qa.pages.Leads_Page;
import pom.qa.pages.Login_Page;
import pom.qa.pages.Merge_Leads_Page;
import pom.qa.pages.Pop_FL_Page;
import pom.qa.pages.View_Leads_Page;
import wdMethods.ProjectMethods;

public class Merge_Lead_Test extends ProjectMethods{
	@BeforeTest
	public void beforeTest() {
		dataSheetName="MergeLead";
		System.out.println("This is @BeforeTest");
	}

	@BeforeMethod
	public void beforeMethod() {
		startApp(config.getProperty("Browser"),config.getProperty("Url"));
		new Login_Page().Login();
		new Home_Page_1().click_CRM();
		new Home_Page_2().click_Leads();
		new Leads_Page().clk_MergeLeads();
		System.out.println("This is @Before Method");
	}
	
	@Test (dataProvider="FetchData")
	public void mergeLeads(String Mfn1, String Mfn2) throws Exception {
		
		new Merge_Leads_Page()
		.clk_Fleads();
		new Pop_FL_Page()
		.enter_Pfn(Mfn1)
		.clk_Pfl()
		.clk_Pfls();
		new Merge_Leads_Page()
		.clk_Tleads();
		new Pop_FL_Page()
		.enter_Pfn(Mfn2)
		.clk_Pfl()
		.clk_Pfls();
		new Merge_Leads_Page()
		.clk_Mleads();
		new View_Leads_Page()
		.clk_VFindLeads();
		new Find_Leads_Page()
		.enter_fname(Mfn1)
		.clk_finLd()
		.verify_PgInfo();
	
		}
}
