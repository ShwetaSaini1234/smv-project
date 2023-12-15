package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class array_sd {
	
	public static WebDriver driver;
	String URL="https://dsportalapp.herokuapp.com"; 
	
	By getstarted=By.className("btn");
	By signoption=By.xpath("//div[@id='navbarCollapse']/div[2]/ul/a[3]");
	By username = By.id("id_username");
	By password=By.xpath("//div[@class='col-sm']/form/input[3]");
	By loginbutton=By.xpath("//div[@class='col-sm']/form/input[4]");
	By getstartdbutton=By.xpath("//a[@href='array']");
	By arrayinpython=By.xpath("//a[@class='list-group-item']"); 
	By tryhere=By.xpath("//div[@class='col-sm']/a");
	By arraytryhereeditor=By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By arrayrunbutton=By.xpath("//form[@id=\"answer_form\"]/button");
	By arraysusinglist=By.linkText("Arrays Using List");
	By basicopratonlist=By.linkText("Basic Operations in Lists");
	By applcationofarray=By.linkText("Applications of Array");
	By practicequestion=By.linkText("Practice Questions");
	By searchtharraylink=By.linkText("Search the array");
	By maxconscutvonelink=By.linkText("Max Consecutive Ones");
	By evennumbrdigitlink=By.partialLinkText("Find Numbers with Even");
	By sofsortdarraylink=By.linkText("Squares of a Sorted Array");


	@Given("I am on home page")
	public void i_am_on_home_page() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get(URL);
		driver.findElement(getstarted).click();
		driver.findElement(signoption).click();
		driver.findElement(username).sendKeys("mvs.com");
		driver.findElement(password).sendKeys("autum@23");
		driver.findElement(loginbutton).click();
		
	}

	@When("I click on get started button under Array")
	public void i_click_on_get_started_button_under_Array() {
	
		driver.findElement(getstartdbutton).click();
   
  }
	@Then("I am redirected to Array page")
	public void i_am_redirected_to_array_page() {

		driver.getPageSource().contains("A	rray");
	   
		driver.close();
	}

	@When("I click on Array get started button")
	public void i_click_on_array_get_started_button() {
	 
		driver.findElement(getstartdbutton).click();
	   
	}

	@When("I click on Arrays in python link")
	public void i_click_on_arrays_in_python_link() {
	 
	   driver.findElement(arrayinpython).click();
	}

	@Then("I am redirected to Arrays in python page")
	public void i_am_redirected_to_arrays_in_python_page() {
	 
	   driver.getPageSource().contains("Arrays in Python");
	}

	@When("I click on Try here button")
	public void i_click_on_try_here_button() {
	 
	   driver.findElement(tryhere).click();
	}
	@Then ("I should be redirected to a tryEditor page with Run button")
	public void i_should_be_redirected_to_a_tryEditor_page_with_Run_button() {
		
    	  driver.getPageSource().contains("Run");	  
   
    }

    @When("I enter code in arraytryeditor and click Run")
    public void i_enter_code_in_arraytryeditor_and_click_run() {
        
    	 driver.findElement(arraytryhereeditor).sendKeys("print 'hello';");
    	 
    }  
    
        @Then("The array code should run sucessfully")
        public void the_array_code_should_run_sucessfully() {
            
        	driver.findElement(arrayrunbutton).click();
        	
        	driver.close();
   }

 
	@When("I click on Arrays Using List link")
	public void i_click_on_arrays_using_list_link() {
	 
			driver.findElement(arraysusinglist).click();
	   
	}

	@Then("I am redirected to Arrays Using List page") //s5
	public void i_am_redirected_to_arrays_using_list_page() {
	 
	   driver.getPageSource().contains("Arrays Using List");
	   
	   driver.close();
	}

	@When("I click on Basic Operations in Lists link")
	public void i_click_on_basic_operations_in_lists_link() {
	 
	   driver.findElement(basicopratonlist).click();
	}

	@Then("I am redirected to Basic Operations in Lists page")
	public void i_am_redirected_to_basic_operations_in_lists_page() {
	 
	   driver.getPageSource().contains("Basic Operations in Lists");
	   
	   driver.close();
	}

	@When("I click on  Applications of Array link")
	public void i_click_on_applications_of_array_link() {
	 
	   driver.findElement(applcationofarray).click();
	}

	@Then("I am redirected to Applications of Array link page")
	public void i_am_redirected_to_applications_of_array_link_page() {
	 
	   driver.getPageSource().contains("Applications of Array");
	   
	   driver.close();
	   
	}
	
	@When("I click on Array Practice Questions link")
	public void i_click_on_array_practice_questions_link() {
    	
    	driver.findElement(practicequestion).click();
    	
    }
	@Then("I should be redirected to Practice Questions page")
	public void i_should_be_redirected_to_practice_questions_page() {
	 
	   System.out.println("I am on practice question page");
	   
	   driver.close();
	   
	}
	@When("I click on Search the array link")
	public void i_click_on_search_the_array_link() {
	 
	   driver.findElement(searchtharraylink).click();
	}

	@Then("I should be redirected to Questions tryEditor page with Run and Submit buttons")
	public void i_should_be_redirected_to_questions_try_editor_page_with_run_and_submit_buttons() {
	 
		driver.getPageSource().contains("Run");
		driver.getPageSource().contains("Submit");
		
		driver.close();
	   
	}

	@When("I click on Max Consecutive Ones link")
	public void i_click_on_max_consecutive_ones_link() {
	 
	   driver.findElement(maxconscutvonelink).click();
	}

	@When("I click on Find Numbers with Even Number of Digits link")
	public void i_click_on_find_numbers_with_even_number_of_digits_link() {
	 
	   driver.findElement(evennumbrdigitlink).click();
	}

	@When("I click on Squares of Sorted Array link")
	public void i_click_on_squares_of_sorted_array_link() {
	 
	   driver.findElement(sofsortdarraylink).click();
	   
	}
}
