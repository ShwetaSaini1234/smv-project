package StepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.*;

public class Homepage_sd {

	public static WebDriver driver;
	String URL="https://dsportalapp.herokuapp.com"; 
	By getstarted=By.className("btn");
	By getstartdbutton=By.xpath("//a[@href='data-structures-introduction']");
	By alertmsg=By.xpath("/html/body/div[2]");
	By NumpyNinja = By.className("navbar-brand");
	By signoption=By.xpath("//div[2]//ul//a[3]");
	By loginbutton=By.xpath("//div[@class='col-sm']/form/input[4]");
	By signoutbutton = By.xpath("//div[2]//ul//a[3]");
	By username = By.id("id_username");
	By password=By.xpath("//div[@class='col-sm']/form/input[3]");
	
	@Given("browser is open")
	public void browser_is_open() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	@When("I click on button")
	public void i_click_on_button() {
		driver.findElement (getstarted).click(); 	
	}
	@Then("I am navigate to the home page")
		public void i_am_navigate_to_the_home_page() 
	{
	    driver.getPageSource().contains("//*[@id=\\\"navbarCollapse\\\"]/div[2]/ul/a[2]");
	}
	
	@When("I click on get started button")
	public void i_click_on_get_started_button() {
		driver.findElement(getstartdbutton).click();
	}
	@Then("alert messgae is displayed")
	public void alert_messgae_is_displayed() 
	{
	    driver.findElement(alertmsg);	    

	}
	@When("user is navigated to the login home page")
	public void user_is_navigated_to_the_login_home_page() {
		driver.findElement(NumpyNinja).isDisplayed();
	}
	@Then("user click on the sign in button")
	public void user_click_on_the_sign_in_button() {
		driver.findElement(signoption).click();
	}
	@Given("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		driver.findElement(signoption).click();
		driver.findElement(username).sendKeys("mvs.com");
		driver.findElement(password).sendKeys("autum@23");
	}
	@When("user click on the login button")
	public void user_clicks_on_the_login_button() {
		driver.findElement(loginbutton).click();
	}
	@Then("user is navigated to the portal home page")
	public void user_is_navigated_to_the_portal_home_page() {
		driver.findElement(signoutbutton).isDisplayed();
	}
	@And("home page user click on the logout button")
	public void home_page_user_clicks_on_the_logout_button() {
		driver.findElement(signoutbutton).click();
		driver.close();
		driver.quit();
	}
}
