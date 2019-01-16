package pom.qa.pages;

import wdMethods.ProjectMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Lead_Page extends ProjectMethods{
	
	public Create_Lead_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="createLeadForm_companyName")
	WebElement cmpnyNam;
	
	@FindBy(id="createLeadForm_firstName")
	WebElement firNam;
	
	@FindBy(id="createLeadForm_lastName")
	WebElement lasNam;
	
	@FindBy(id="createLeadForm_currencyUomId")
	WebElement cncy;
	
	@FindBy(className="smallSubmit")
	WebElement clBtn;
	
	public Create_Lead_Page enterCmpnyNam(String comVal) {
		type(cmpnyNam,comVal);
		return this;
	}
	
	public Create_Lead_Page enterFirstNam(String FNVal) {
		type(firNam,FNVal);
		return this;
	}
	
	public Create_Lead_Page enterLastNam(String LNVal) {
		type(lasNam,LNVal);
		return this;
	}
	
	public Create_Lead_Page enterCncyNam(String cyVal) {
		selectDropDownUsingText(cncy,cyVal);
		return this;
	}
	
	public View_Leads_Page clkCreLead() {
		click(clBtn);
		return new View_Leads_Page();
	}
	
	

}
