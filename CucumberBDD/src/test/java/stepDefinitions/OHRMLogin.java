package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OHRMLogin {
	
	public RemoteWebDriver driver;
	
	@Given("User is on the orange HR login page")
	public void user_is_on_the_orange_HR_login_page() {
	    
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}

	@When("User keys the valid username")
	public void user_keys_the_valid_username() {
	    
		driver.findElement(By.name("username")).sendKeys("Admin");
		
	}

	@When("User keys the valid password")
	public void user_keys_the_valid_password() {
	    
		driver.findElement(By.name("password")).sendKeys("admin123");
		
	}

	@When("User click on the login button")
	public void user_click_on_the_login_button() {
	    
		driver.findElement(By.cssSelector(".oxd-button")).click();
		
	}

	@Then("Browser should navigate to the home page")
	public void browser_should_navigate_to_the_home_page() {
	    
		System.out.println("Welcome page displayed");
		
	}

}
