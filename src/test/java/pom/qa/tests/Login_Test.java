package pom.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pom.qa.pages.Home_Page_1;
import pom.qa.pages.Login_Page;
import wdMethods.ProjectMethods;

public class Login_Test extends ProjectMethods{
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is @BeforeTest");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		startApp(config.getProperty("Browser"),config.getProperty("Url"));
		System.out.println("This is @Before Method");
	}
	
	@Test (priority=1)
	public void Verify_Login() {
		new Login_Page()
		.Login();
		new Home_Page_1()
		.verify_Welcome();
	}
	
}
