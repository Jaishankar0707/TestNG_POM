package pom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import wdMethods.ProjectMethods;

public class View_Leads_Page extends ProjectMethods{
	
	public View_Leads_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="sectionHeaderTitle_leads")
	WebElement hdr;
	
	@FindBy(id="viewLead_firstName_sp")
	WebElement Efn;
	
	@FindBy(className="subMenuButtonDangerous")
	WebElement del;
	
	@FindBy(xpath="(//a[@class=\"subMenuButton\"])[3]")
	WebElement edt;
	
	@FindBy(xpath="//a[text()=\"Find Leads\"]")
	WebElement VFiLd;
	
	public My_Leads_Page delete_Lead() {
		click(del);
		return new My_Leads_Page();
	}
	
	public View_Leads_Page Title_verify() {
		Assert.assertEquals(hdr.getText(),"View Lead");
		return this;
	}
	
	public Find_Leads_Page clk_VFindLeads() {
		click(VFiLd);
		return new Find_Leads_Page();
	}
	
	public Edit_Leads_Page edit_Lead() {
		click(edt);
		return new Edit_Leads_Page();
	}
	
	public View_Leads_Page edit_verify(String fnE) {
		Assert.assertEquals(Efn.getText(),fnE);
		return this;
	}

}
