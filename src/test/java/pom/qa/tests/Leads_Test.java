package pom.qa.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pom.qa.pages.Home_Page_1;
import pom.qa.pages.Home_Page_2;
import pom.qa.pages.Leads_Page;
import pom.qa.pages.Login_Page;
import wdMethods.ProjectMethods;

public class Leads_Test extends ProjectMethods{
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is @BeforeTest");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		startApp(config.getProperty("Browser"),config.getProperty("Url"));
		new Login_Page().Login();
		new Home_Page_1().click_CRM();
		new Home_Page_2().click_Leads();
		System.out.println("This is @Before Method");
	}
	
	@Test
	public void Verify_Leads_title() {
		
		AssertJUnit.assertTrue(new Leads_Page()
		.page_title());
	}
	
	
}
