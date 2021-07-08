package product.amazon.tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import dataProvider.ConfigFileReader;
import product.amazon.po.Po_Search;
import utils.Browser;
public class AmazonSearchTextBox {
	 String propertyFilePath= "configs//Configuration.properties";
		ConfigFileReader configFileReader=new ConfigFileReader();
	@Test
	public  void  cartSearch ()
	{
		WebDriver driver=Browser.getdriver();
		driver.get(configFileReader.getAmazonUrl());
		configFileReader.getImplicitlyWait();
		Po_Search Po_SearchObj=PageFactory.initElements(driver, Po_Search.class);
		Po_SearchObj.searchProduct("Mobile");
		driver.close();
		
		
	}
}
