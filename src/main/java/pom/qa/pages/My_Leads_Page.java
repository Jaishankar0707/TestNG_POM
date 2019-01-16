package pom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class My_Leads_Page extends ProjectMethods{
	
	public My_Leads_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="sectionHeaderTitle_leads")
	WebElement vldsTitl;
	
	@FindBy(xpath="//a[text()=\"Find Leads\"]")
	WebElement MlFiLd;
	
	public Find_Leads_Page Ml_Clk_FindLeads() {
		click(MlFiLd);
		return new Find_Leads_Page();
	}

}
