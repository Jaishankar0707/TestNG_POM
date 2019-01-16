package pom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import wdMethods.ProjectMethods;

public class Find_Leads_Page extends ProjectMethods{
	
	public Find_Leads_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//input[@name=\"firstName\"])[3]")
	WebElement fname;
	
	@FindBy(xpath="//button[text()=\"Find Leads\"]")
	WebElement fndLd;
	
	@FindBy(xpath="(//div[@class=\"x-grid3-cell-inner x-grid3-col-partyId\"]/a)[1]")
	WebElement fmLd;
	
	@FindBy(xpath="//div[@class=\"x-paging-info\"]")
	WebElement pgInfo;
	
	public Find_Leads_Page enter_fname(String finam) {
		type(fname,finam);
		return this;
	}
	
	public Find_Leads_Page clk_finLd() throws Exception {
		click(fndLd);
		Thread.sleep(100);
		return this;
	}
	
	public View_Leads_Page clk_fiMaLd() {
		click(fmLd);
		return new View_Leads_Page();
	}
	
	public Find_Leads_Page verify_PgInfo() {
		Assert.assertEquals(getText(pgInfo), "No records to display");
		return this;
	}
}
