package pom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Home_Page_2 extends ProjectMethods{
	public Home_Page_2() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),\"My Home\")]")
	WebElement home;
	
	@FindBy(xpath="//a[contains(text(),\"Leads\")]")
	WebElement leadLnk;
	
	public Leads_Page click_Leads() {
		click(leadLnk);
		return new Leads_Page();
	}
}
