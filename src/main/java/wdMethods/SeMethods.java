package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{
	public static RemoteWebDriver driver;

	@Override
	public void startApp(String browser, String url) 
	{
		try{
			if(browser.equalsIgnoreCase("chrome"))
		{
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
				driver = new ChromeDriver();
		}
			else if(browser.equalsIgnoreCase("firefox"))
		{
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
				driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			}
		catch(WebDriverException e) {}
	}

	@Override
	public WebElement locateElement(String locator, String locValue) {
		// TODO Auto-generated method stub
		try
		{
				switch (locator)
				{
				case "id" : return driver.findElementById(locValue);
				case "class" : return driver.findElementByClassName(locValue);
				case "linkText" : return driver.findElementByLinkText(locValue);
				case "x-path" : return driver.findElementByXPath(locValue);
				case "tag" : return driver.findElementByTagName(locValue);
				case "name" : return driver.findElementByName(locValue);
				case "partialLinkText" : return driver.findElementByPartialLinkText(locValue);
				}
				
		}
		catch (NoSuchElementException e)
		{
			
		}
		catch(WebDriverException e) {}
		return null;
	}

	@Override
	public WebElement locateElement(String locValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void type(WebElement ele, String data) {
		// TODO Auto-generated method stub
		try
		{
			ele.clear();
			ele.sendKeys(data);
		}
		catch (NoSuchElementException e)
		{
			
		}
		catch(WebDriverException e) {
			System.out.println("The field to type couldnt be found");
		}
		finally
		{
			takeSnap();
		}
	}

	@Override
	public void click(WebElement ele) {
		// TODO Auto-generated method stub
		try
		{
		ele.click();
		}
		catch (NoSuchElementException e)
		{
			
		}
		catch(WebDriverException e) {}
	}

	@Override
	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		String text="";
		try
		{
		text=ele.getText();
		}
		catch (NoSuchElementException e)
		{
			
		}
		catch(WebDriverException e) {}
		return text;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		try
		{
		Select sel=new Select(ele);
		sel.selectByVisibleText(value);
		}
		catch (NoSuchElementException e)
		{
			
		}
		catch (ElementNotVisibleException e)
		{
			
		}
		catch(WebDriverException e) {}
	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		try
		{
		Select sel=new Select(ele);
		sel.selectByIndex(index);
		}
		catch (NoSuchElementException e)
		{
			
		}
		catch (ElementNotVisibleException e)
		{
			
		}
		catch(WebDriverException e) {}
	}

	@Override
	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		boolean title = false;
		try
		{
		if(driver.getTitle().equals(expectedTitle))
			{
				title=true;
			}
		else
			{
				title=false;
			}
		
		}
		catch(WebDriverException e) {}
		return title;
	}

	@Override
	public boolean verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		boolean result=false;
		try
		{
		String text=ele.getText();
		if (text.equalsIgnoreCase(expectedText)) 
			{
				result=true;
			}
		else
			{
			result=false;
			}
		}
		catch (NoSuchElementException e)
		{
			
		}
		catch (ElementNotVisibleException e)
		{
			
		}
		catch(WebDriverException e) {}
		return result;
	}

	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		try
		{
		String text=ele.getText();
		if (text.contains(expectedText)) 
			{
				System.out.println("The text is a partial match");
			}
		else
			{
				System.out.println("The text is not a match");
			}
		}
		catch (NoSuchElementException e)
		{
			
		}
		catch (ElementNotVisibleException e)
		{
			
		}
		catch(WebDriverException e) {}
	}

	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		try
		{
		if(ele.isSelected()==true)
			{
				System.out.println("The element is selected");
			}
		else
			{
				System.out.println("The element is not selected");
			}
		}
		catch (NoSuchElementException e)
		{
			
		}
		catch (ElementNotVisibleException e)
		{
			
		}
		catch (WebDriverException e)
		{
			
		}
	}

	@Override
	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		try
		{
		if(ele.isDisplayed()==true)
			{
				System.out.println("The element is displayed");
			}
		else
			{
				System.out.println("The element is not displayed");
			}
		}
		catch (NoSuchElementException e)
		{
			
		}
		catch (ElementNotVisibleException e)
		{
			
		}
		catch (WebDriverException e)
		{
			
		}
	}

	@Override
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		try
		{
		Set<String> winHandle=driver.getWindowHandles();
		List<String> winHandleList=new ArrayList<>();
		winHandleList.addAll(winHandle);
		driver.switchTo().window(winHandleList.get(index));
		}
		catch (NoSuchWindowException e)
		{
			
		}
		catch (WebDriverException e)
		{
			
		}	
	}

	@Override
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		try
		{
		driver.switchTo().frame(ele);
		}
		catch (NoSuchFrameException e)
		{
			
		}
		catch (WebDriverException e)
		{
			
		}
	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		try
		{
		driver.switchTo().alert().accept();
		}
		catch (NoAlertPresentException e)
		{
			
		}
		catch (WebDriverException e)
		{
			
		}
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		try
		{
		driver.switchTo().alert().dismiss();
		}
		catch (NoAlertPresentException e)
		{
			
		}
		catch (WebDriverException e)
		{
			
		}
	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		String aText="";
		try
		{
		aText=driver.switchTo().alert().getText();
		}
		catch (NoAlertPresentException e)
		{
			
		}
		catch (WebDriverException e){}
		return aText;
	}

	@Override
	public long takeSnap() {
		// TODO Auto-generated method stub
		long number=(long) Math.floor(Math.random()*900000000L+10000000L);
		try
		{
		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("./reports/images"+number+".jpg"));
		}
		catch(IOException e) {}
		catch (WebDriverException e){}
		return number;
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
		
	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
	driver.quit();
		
	}
	

}
