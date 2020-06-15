package DemoRegister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DempReg {
	private WebDriver driver;
	@Before
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver" ,"E:\\Capgemini\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		
	}

	@Given("^User is on Register Page$")
	public void user_is_on_Register_Page() throws Throwable {
		driver.get("C:\\Users\\ROHAN\\Desktop\\Shahdat\\addDriver.html");
	
	}

	@When("^User enters  valid driver data$")
	public void user_enters_valid_driver_data() throws Throwable {
		driver.findElement(By.name("vehicleNumber")).sendKeys("up14du4712");
		driver.findElement(By.name("driverid")).sendKeys("BR04DL7862");
		driver.findElement(By.name("firstName")).sendKeys("Rajesh");
		driver.findElement(By.name("lastName")).sendKeys("kumar");
		driver.findElement(By.name("contactNumber")).sendKeys("7277328102");
		driver.findElement(By.name("licenseNumber")).sendKeys("BR04DL78698");
		driver.findElement(By.name("vehicleType")).sendKeys("SUV");
		driver.findElement(By.id("submit")).click();
	   
	}

	@Then("^User navigates to next page$")
	public void user_navigates_to_next_page() throws Throwable {
		//driver.findElement(By.id("submit")).click();
		//driver.close();
	   
	}

	@Given("^User is on Register page$")
	public void user_is_on_Register_page() throws Throwable {
		driver.get("file:///C:/Users/ROHAN/Desktop/Shahdat/addDriver.html");
	  
	}

	@When("^user enters valid firstname as \"([^\"]*)\" and invalid lastName as \"([^\"]*)\"$")
	public void user_enters_valid_firstname_as_and_invalid_lastName_as(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("vehicleNumber")).sendKeys("up14du4712");
		driver.findElement(By.name("driverid")).sendKeys("BR04DL7862");
		driver.findElement(By.name("firstName")).sendKeys(arg1);
		driver.findElement(By.name("lastName")).sendKeys(arg2);
		driver.findElement(By.name("contactNumber")).sendKeys("7277328102");
		driver.findElement(By.name("licenseNumber")).sendKeys("BR04DL78698");
		driver.findElement(By.name("vehicleType")).sendKeys("SUV");
		driver.findElement(By.id("submit")).click();
	  
	}

	@Then("^Register should be unsucessful$")
	public void register_should_be_unsucessful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	


}
