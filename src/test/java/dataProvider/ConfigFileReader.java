package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	 Properties prop=new Properties();
	 
	 String propertyFilePath = System.getProperty("user.dir") + "\\Configs\\Configs.properties";
	public ConfigFileReader(){
		 BufferedReader reader;
		 try {
		 reader = new BufferedReader(new FileReader(propertyFilePath));
		 prop = new Properties();
		 try {
		 prop.load(reader);
		 reader.close();
		 } catch (IOException e) {
		 e.printStackTrace();
		 }
		 } catch (FileNotFoundException e) {
		 e.printStackTrace();
		 throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		 } 
		 }
		 
		 public String getDriverPath(){
		 String driverPath = prop.getProperty("driverPath");
		 if(driverPath!= null) return driverPath;
		 else throw new RuntimeException("DriverPath not specified in the Configuration.properties file."); 
		 }
		 
		 public long getImplicitlyWait() { 
		 String implicitlyWait = prop.getProperty("implicitlyWait");
		 if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
		 else throw new RuntimeException("ImplicitlyWait not specified in the Configuration.properties file."); 
		 }
		 
		 public String getAmazonUrl() {
		 String url = prop.getProperty("AmazonUrl");
		 if(url != null) return url;
		 else throw new RuntimeException("Url not specified in the Configuration.properties file.");
		
		 }
		 public String getUrl2() {
			 String url = prop.getProperty("url2");
			 if(url != null) return url;
			 else throw new RuntimeException("Url not specified in the Configuration.properties file.");
		 

}
}
