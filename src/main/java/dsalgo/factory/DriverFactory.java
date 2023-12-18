package dsalgo.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver>tlDriver = new ThreadLocal<>();
	/*
	 * This method is used to initialize the thradlocal driver on 
	 * the basis of given browser
	 */
	
	public  WebDriver init_driver(String browser) {
		
				System.out.println("Browser value is:" + browser);
				
				if (browser.equals("chrome")) {
					WebDriverManager.chromedriver().setup();
					tlDriver.set(new ChromeDriver());
				}
				else if (browser.equals("edge")) {
					WebDriverManager.edgedriver().setup();
					tlDriver.set(new EdgeDriver());
				}
				else if (browser.equals("firefox")) {
					WebDriverManager.firefoxdriver().setup();
					tlDriver.set(new FirefoxDriver());
				}	
				else {
					System.out.println("Please pass correct browser value" + browser );
		}
		
		  getDriver().manage().deleteAllCookies();
		  getDriver().manage().window().maximize();
		  return getDriver();
	}	
	/*
	 * this is used to get the driver with ThreadLocal
	 */
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
}		
		
		

