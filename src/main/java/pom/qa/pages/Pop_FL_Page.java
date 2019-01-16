package pom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Pop_FL_Page extends ProjectMethods{
	
	public Pop_FL_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name=\"firstName\"]")
	WebElement MePFr;
	
	@FindBy(xpath="//button[text()=\"Find Leads\"]")
	WebElement MePbtn;
	
	@FindBy(xpath="(//a[@class=\"linktext\"])[1]")
	WebElement MePs;
	
	public Pop_FL_Page enter_Pfn(String Pfn) {
		type(MePFr, Pfn);
		return this;
	}
	
	public Pop_FL_Page clk_Pfl() throws Exception {
		click(MePbtn);
		Thread.sleep(100);
		return this;
	}
	
	public Merge_Leads_Page clk_Pfls() {
		click(MePs);
		switchToWindow(0);
		return new Merge_Leads_Page();
	}
}
