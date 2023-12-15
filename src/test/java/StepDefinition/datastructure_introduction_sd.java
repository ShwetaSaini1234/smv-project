package StepDefinition;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.messages.types.Duration;

public class datastructure_introduction_sd {
	
	public static WebDriver driver;
	String URL="https://dsportalapp.herokuapp.com";
	
	By getstarted=By.className("btn");
	By signoption=By.xpath("//div[@id='navbarCollapse']/div[2]/ul/a[3]");
	By username = By.id("id_username");
	By password=By.xpath("//div[@class='col-sm']/form/input[3]");
	By loginbutton=By.xpath("//div[@class='col-sm']/form/input[4]");
	By NumpyNinja=By.className("navbar-brand");
	By getstartdbutton=By.xpath("//div[@class='col']/div/div/a");
	By timecomplexty=By.xpath("//html/body/div[2]/ul/a");
	By practicqstn=By.xpath("//div[@id='content']/a");
	By tryhere=By.xpath("//div[@class='col-sm']/a");
	By tryhereeditor=By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By runbutton=By.xpath("//*[@id=\"answer_form\"]/button");
	
	
	@Given("home page is open")
	public void home_page_is_open() {
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.manage().window().maximize();
		  
		  driver.get(URL); 
		  driver.findElement(getstarted).click();
	}

	@When("I click on Sign in button")
	public void i_click_on_sign_in_button() {
	  
	   driver.findElement(signoption).click();
	}

	@When("I enter username and password")
	public void i_enter_username_and_password() {
		driver.findElement(username).sendKeys("mvs.com");
		driver.findElement(password).sendKeys("autum@23");
		driver.findElement(loginbutton).click();
	}

	@Then("I am navigated to home page afte logged in")
	public void i_am_navigate_to_home_page_afte_logged_in() {
	  
		driver.getPageSource().contains("NumpyNinja");
		//driver.findElement(NumpyNinja).isDisplayed();
		
	  //  driver.close();
	 
	   
	}

	@Given("I am on logged in home page")
	public void i_am_on_logged_in_home_page() {
	   
	}

	@When("I click on get started button below datastructure introduction")
	public void i_click_on_get_started_button_below_datastructure_introduction() {
	  
		driver.findElement(getstartdbutton).click();
	   
	}

	@Then("I land in Data Structures Introduction Page")
	public void i_land_in_data_structures_introduction_page() {
	  
	   driver.getPageSource().contains("What are Data structures");
	   
	   System.out.println("I am on What are Data structures");
	   
	}

	@When("I click on Time Complexity link")
	public void i_click_on_time_complexity_link() {
	  
	   driver.findElement(timecomplexty).click();
	}

	@Then("I redirected in Time Complexity of  Datastructure Introduction Page")
	public void i_redirected_in_time_complexity_of_datastructure_introduction_page() {
	  
	   driver.getPageSource().contains("Time Complexity and Space");
	   
	}

	@When("I click on Practice Questions link")
	public void i_click_on_practice_questions_link() {
	  
		driver.findElement(practicqstn).click();
	   
	}

	@Then("I should redirected to the Practice Questions page")
	public void i_should_redirected_to_the_practice_questions_page() {
	  
	}

	@When("I click on try here button")
	public void i_click_on_try_here_button() {
	  
	   driver.findElement(tryhere).click();
	}

	@Then("I should be redirected to a page having an tryEditor with a Run button")
	public void i_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button() {
	  
	   driver.getPageSource().contains("Run");
	   
	  
	}

	@When("I enter code in tryeditor and click Run")
	public void i_enter_code_in_tryeditor_and_click_run() throws InterruptedException {
	  
	   driver.findElement(tryhereeditor).sendKeys("print 'hello';");
	   Thread.sleep(3000); 
	   
	}

	@Then("The code should run sucessfully")
	public void the_code_should_run_sucessfully() {
		
		 driver.findElement(runbutton).click();
		 
	}
	

}
