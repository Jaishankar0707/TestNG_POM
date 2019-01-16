package pom.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;
public class Merge_Leads_Page extends ProjectMethods{
	
	public Merge_Leads_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//table[@id=\"widget_ComboBox_partyIdFrom\"]/following-sibling::a")
	WebElement MeFr;

	@FindBy(xpath="//table[@id=\"widget_ComboBox_partyIdTo\"]/following-sibling::a")
	WebElement MeTo;
	
	@FindBy(xpath="//a[@class=\"buttonDangerous\"]")
	WebElement MeBtn;
	
	public View_Leads_Page clk_Mleads() {
		click(MeBtn);
		acceptAlert();
		return new View_Leads_Page();
	}
	
	public Pop_FL_Page clk_Fleads() {
		click(MeFr);
		switchToWindow(1);
		return new Pop_FL_Page();
	}
	
	public Pop_FL_Page clk_Tleads() {
		click(MeTo);
		switchToWindow(1);
		return new Pop_FL_Page();
	}
}
