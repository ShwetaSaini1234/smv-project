package dsalgo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 

public class homepage {
	
		private WebDriver driver;
	
		private By getstarted=By.className("btn");
		private By getstartdbutton=By.xpath("//a[@href='data-structures-introduction']");
		private By alertmsg=By.xpath("/html/body/div[2]");
		private By NumpyNinja = By.className("navbar-brand");
		private By signoption=By.xpath("//div[2]//ul//a[3]");
		private By loginbutton=By.xpath("//div[@class='col-sm']/form/input[4]");
		private By signoutbutton = By.xpath("//div[2]//ul//a[3]");
		private By username = By.id("id_username");
		private By password=By.id("id_password");
		private By datastructrdrpdwn=By.xpath("//div[@id=\"navbarCollapse\"]/div/div/a");
		private By linkdlistdropdwn=By.xpath("//div[@id=\"navbarCollapse\"]/div/div/div/a[2]");
		private By ddlist=By.xpath("//div[@id=\"navbarCollapse\"]/div/div/div/a");
    
       public homepage(WebDriver driver) {  
    	            this.driver = driver;
       }
       
       public void clickStartedBtn() {
       				driver.findElement(getstarted).click();
       }
       
       public boolean homePageVerification() {
    	         return  driver.getPageSource().contains("//*[@id=\\\"navbarCollapse\\\"]/div[2]/ul/a[2]");
       }
   	
	   	public void clickOnGetStartedBtn() {
	   		
	   		driver.findElement(getstartdbutton).click();
	   	}
	
//	   	public void alert_messgae_is_displayed() 
//	   	{
//	   	    driver.findElement(alertmsg).isDisplayed();
//	   	   // assertTrue("You are not logged in",true); 
//	   	}
//	   	
//	   	public void user_is_navigated_to_the_login_home_page() {
//	   		
//	   		driver.findElement(NumpyNinja).isDisplayed();
//	   	}
//	
//	   	public void user_click_on_the_sign_in_button() {
//	   		
//	   		driver.findElement(signoption).click();
//   	}
}