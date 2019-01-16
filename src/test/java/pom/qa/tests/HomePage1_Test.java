package pom.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pom.qa.pages.Home_Page_1;
import pom.qa.pages.Login_Page;
import wdMethods.ProjectMethods;

public class HomePage1_Test extends ProjectMethods{
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is @BeforeTest");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		startApp(config.getProperty("Browser"),config.getProperty("Url"));
		new Login_Page().Login();
		System.out.println("This is @Before Method");
	}
	
	@Test
	public void verify_CRM_Link() {
		new Home_Page_1()
		.verify_CRM();
	}
	
	@Test
	public void verify_Logout() {
		new Home_Page_1()
		.logOut();
	}
	
	@Test
	public void verify_CRM_click() {
		new Home_Page_1()
		.click_CRM();
	}
	
}
