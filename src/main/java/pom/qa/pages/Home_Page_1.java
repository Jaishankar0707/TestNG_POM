package pom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import wdMethods.ProjectMethods;

public class Home_Page_1 extends ProjectMethods{
	
	public Home_Page_1() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@id=\"form\"]/h2")
	WebElement wel;
	
	@FindBy(className="decorativeSubmit")
	WebElement LogOut;
	
	@FindBy(linkText="CRM/SFA")
	WebElement CRM;
	
	public void verify_Welcome() {
		Assert.assertEquals(wel.getText(), "Welcome\n" + 
	  		"Demo Sales Manager","Login is failure");
	}
	
	public void verify_CRM() {
		verifyDisplayed(CRM);
	}
	
	public Login_Page logOut() {
		click(LogOut);
		return new Login_Page();
	}
	
	public Home_Page_2 click_CRM() {
		click(CRM);
		return new Home_Page_2();
	}
}
