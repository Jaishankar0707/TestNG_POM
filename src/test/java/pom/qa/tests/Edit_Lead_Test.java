package pom.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pom.qa.pages.Edit_Leads_Page;
import pom.qa.pages.Find_Leads_Page;
import pom.qa.pages.Home_Page_1;
import pom.qa.pages.Home_Page_2;
import pom.qa.pages.Leads_Page;
import pom.qa.pages.Login_Page;
import pom.qa.pages.View_Leads_Page;
import wdMethods.ProjectMethods;

public class Edit_Lead_Test extends ProjectMethods{
	
	@BeforeTest
	public void beforeTest() {
		dataSheetName="EditLead";
		System.out.println("This is @BeforeTest");
	}

	@BeforeMethod
	public void beforeMethod() {
		startApp(config.getProperty("Browser"),config.getProperty("Url"));
		new Login_Page().Login();
		new Home_Page_1().click_CRM();
		new Home_Page_2().click_Leads();
		new Leads_Page().clk_FindLeads();
		System.out.println("This is @Before Method");
	}
	
	@Test (dataProvider="FetchData")
	public void createLeads(String FN, String FNe) throws Exception {
		new Find_Leads_Page()
		.enter_fname(FN)
		.clk_finLd()
		.clk_fiMaLd();
		new View_Leads_Page()
		.edit_Lead();
		new Edit_Leads_Page()
		.edit_Fname(FNe)
		.Edit_Update();
		new View_Leads_Page()
		.edit_verify(FNe);
			
	}
}
