package wdMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import pom.qa.TestData.TestData;

public class ProjectMethods extends SeMethods{
	public static Properties config;
	public String dataSheetName;
	
@BeforeSuite
public void beforeSuite() throws IOException {
	config=new Properties();
	FileInputStream fis=new FileInputStream("/Users/Jai/Documents/TestLeaf/eclipse-workspace/Learn_TestNG_POM/src/main/java/pom/qa/Env_Var/Config.properties");
	config.load(fis);
	System.out.println("This is @BeforeSuite");
}

/*@BeforeTest
public void beforeTest() {
	System.out.println("This is @BeforeTest");
}*/

@BeforeClass
public void beforeClass() {
	System.out.println("This is @BeforeClass");
}

@AfterMethod
public void afterMethod() {
	closeAllBrowsers();
	System.out.println("This is @AfterMethod");
}

@AfterClass
public void afterClass() {
	System.out.println("This is @AfterClass");
}

@AfterTest
public void afterTest() {
	System.out.println("This is @AfterTest");
}
@DataProvider(name="FetchData")
public Object[][] giveData(){
	return TestData.provideData(dataSheetName);
}

}
