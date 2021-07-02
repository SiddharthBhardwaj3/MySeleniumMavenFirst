package Maven;

import org.testng.annotations.Test;

import dataProvider.ConfigFileReader;

import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestConfigs {
	
	  String propertyFilePath= "configs//Configuration.properties";
	ConfigFileReader configFileReader=new ConfigFileReader();
	WebDriver driver;
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Starting Chrome Browser");
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
		driver =new ChromeDriver();
	}
	@BeforeClass
	public void LaunchBrowser()
	{
		System.out.println("Launching Youtube");
	} 
	
	@Test
	public void Test1()
	{
	     driver.manage().window().maximize();
		 driver.get(configFileReader.getUrl1());	    
	    
	    String expectedTitle="YouTube";
		String originalTitle = driver.getTitle();
		AssertJUnit.assertEquals(originalTitle, expectedTitle);

		if(driver.getTitle().equalsIgnoreCase(expectedTitle))
	{
			System.out.println("Tittle Matched");
		}
		 

		System.out.println("YouTube Terminated");
	}
	@Test
	  public void Test2()
	  {
		  System.out.println("Launching Google");
		 
		 
		  driver.manage().window().maximize();
		  driver.get(configFileReader.getUrl2());
		    String expectedTitle="Google";
		    String originalTitle=driver.getTitle();
			Assert.assertEquals(originalTitle, expectedTitle);
			driver.close();
	  }
	  @AfterClass
	  public void AfterGoogle()
	  {
		  System.out.println("Google Terminated");
	  }  
	  
	  
	 @AfterTest
	  public void CloseBrowser()
	  {
		
		System.out.println("Browser Terminated");
		
		
	  }  
	
}
