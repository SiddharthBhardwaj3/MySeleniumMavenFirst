package product.amazon.po;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.Reporter;

public class Po_Search {
	
	WebDriver driver;
	public Po_Search(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(how=How.ID,using="twotabsearchtextbox") 
         	WebElement textBox;
	@FindBy(how=How.ID,using="nav-search-submit-button")
	WebElement submit;
	
	//Methods
	public void textToBeSearched(String arg)
	{
      textBox.sendKeys(arg);
      Reporter.log("Product entered in  Search Box :"+arg, true);
	} 
	public void submitButton()
	{
		submit.click();
		Reporter.log("Search Box Button Clicked.", true);
	}
      
      public void searchProduct(String arg)
      {
    	 textToBeSearched(arg); 
    	 submitButton();
    	 String actual=driver.getTitle();
    	 String expected="Amazon.in : "+arg;
    	 
    			 Assert.assertEquals(actual,expected,"Not able to search" +arg);
    			 Reporter.log("Product Searched successfully:"+arg, true);
      }

}



