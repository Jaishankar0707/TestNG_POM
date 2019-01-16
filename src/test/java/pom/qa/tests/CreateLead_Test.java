package pom.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pom.qa.pages.Create_Lead_Page;
import pom.qa.pages.Home_Page_1;
import pom.qa.pages.Home_Page_2;
import pom.qa.pages.Leads_Page;
import pom.qa.pages.Login_Page;
import pom.qa.pages.View_Leads_Page;
import wdMethods.ProjectMethods;

public class CreateLead_Test extends ProjectMethods{

	@BeforeTest
	public void beforeTest() {
		dataSheetName="CreateLead";
		System.out.println("This is @BeforeTest");
	}

	@BeforeMethod
	public void beforeMethod() {
		startApp(config.getProperty("Browser"),config.getProperty("Url"));
		new Login_Page().Login();
		new Home_Page_1().click_CRM();
		new Home_Page_2().click_Leads();
		new Leads_Page().clk_CreateLead();
		System.out.println("This is @Before Method");
	}
	
	@Test (dataProvider="FetchData")
	public void createLeads(String CN, String FN, String LN, String CC) {
		
		new Create_Lead_Page()
		.enterCmpnyNam(CN)
		.enterFirstNam(FN)
		.enterLastNam(LN)
		.enterCncyNam(CC)
		.clkCreLead();
		new View_Leads_Page()
		.Title_verify();
			
	}
	
}
