package pom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Edit_Leads_Page extends ProjectMethods{
	
	public Edit_Leads_Page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="updateLeadForm_firstName")
	WebElement Efn;
	
	@FindBy(xpath="(//input[@class=\"smallSubmit\"])[1]")
	WebElement Eud;

	public Edit_Leads_Page edit_Fname(String ufn) {
		type(Efn,ufn);
		return this;
	}
	
	public View_Leads_Page Edit_Update() {
		click(Eud);
		return new View_Leads_Page();
	}
}
