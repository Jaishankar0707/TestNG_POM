package pom.qa.tests;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pom.qa.pages.Home_Page_1;
import pom.qa.pages.Home_Page_2;
import pom.qa.pages.Login_Page;
import wdMethods.ProjectMethods;
public class HomePage2_Test extends ProjectMethods{

	@BeforeTest
	public void beforeTest() {
		System.out.println("This is @BeforeTest");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		startApp(config.getProperty("Browser"),config.getProperty("Url"));
		new Login_Page().Login();
		new Home_Page_1().click_CRM();
		System.out.println("This is @Before Method");
	}
	
	@Test
	public void verifyLeadsBtn() {
		new Home_Page_2()
		.click_Leads();
	}
	
}
