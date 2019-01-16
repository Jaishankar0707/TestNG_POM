package pom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Leads_Page extends ProjectMethods{

	public Leads_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()=\"Create Lead\"]")
	WebElement CrLd;
	
	@FindBy(xpath="//a[text()=\"Find Leads\"]")
	WebElement FiLd;
	
	@FindBy(xpath="//a[text()=\"Merge Leads\"]")
	WebElement MeLd;
	
	
	public Create_Lead_Page clk_CreateLead() {
		click(CrLd);
		return new Create_Lead_Page();
	}
	
	public Find_Leads_Page clk_FindLeads() {
		click(FiLd);
		return new Find_Leads_Page();
	}
	
	public Merge_Leads_Page clk_MergeLeads() {
		click(MeLd);
		return new Merge_Leads_Page();
	}
	
	public boolean page_title() {
		boolean status=verifyTitle("My Leads | opentaps CRM");
		return status;
	}
}
