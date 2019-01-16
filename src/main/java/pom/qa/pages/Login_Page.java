package pom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Login_Page extends ProjectMethods{
	
//Initializing the page objects
	
	public Login_Page() {
		PageFactory.initElements(driver, this);
	}
	
//Page Factory - Object Repository
	
	@FindBy(id="username")
	WebElement Urid;
	
	@FindBy(id="password")
	WebElement Pawd;
	
	@FindBy(className="decorativeSubmit")
	WebElement Login;
	
//Action Methods
	
	public Home_Page_1 Login() {
		type(Urid,config.getProperty("Uid"));
		type(Pawd,config.getProperty("Pwd"));
		click(Login);
		return new Home_Page_1();
	}
	

}
