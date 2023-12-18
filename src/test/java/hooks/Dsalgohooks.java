package hooks;


import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import dsalgo.factory.DriverFactory;
import dsalgo.utilites.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Dsalgohooks {
	
		private DriverFactory driverFactory;
		private WebDriver driver;
		private ConfigReader configreader;
		Properties prop;
		
		@Before (order=0)
		public void getproperty() {
					configreader=new ConfigReader();
					prop = configreader.init_prop();		
		}
		
		@Before(order=1)
		public void launchbrowser() {
				String browserName =	prop.getProperty("browser");
				driverFactory = new DriverFactory();
				driver = driverFactory.init_driver(browserName);
						
		}
		
		@After(order=0)
		public void closedriver() {
				driver.quit();	
		}
		
		@After(order=1)
		public void teardown(Scenario scenario) {
			        if (scenario.isFailed()) { 
						//to take screen shot
						String screenshotName = scenario.getName().replaceAll(" " , "_");
						 byte []  sourcePath= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
							 
						  scenario.attach(sourcePath, "image/png", screenshotName);
						}
			
		}
	 
}
