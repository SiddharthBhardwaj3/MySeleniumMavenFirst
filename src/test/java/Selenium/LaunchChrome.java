package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LaunchChrome
{

WebDriver driver;
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Starting Chrome Browser ");
		
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
		driver =new ChromeDriver();
	}
		
	@BeforeClass
	public void LaunchBrowser()
	{
		System.out.println("Launching Youtube");
	} 
	
  @Test
  public void TestAssert() 
  {
	  
	  driver.manage().window().maximize();
	    driver.get("https://www.Youtube.com");
	    String expectedTitle="YouTube";
		String originalTitle = driver.getTitle();
		Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");

		if(driver.getTitle().equalsIgnoreCase(expectedTitle))
		{
			driver.close();
		}

		System.out.println("YouTube Terminated");
  }
 
  	
  @Test
  public void TestAssert2()
  {
	  System.out.println("Launching Google");
	  System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.Google.com");
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
	
	


