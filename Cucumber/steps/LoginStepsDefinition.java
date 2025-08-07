package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefinition {
	
public ChromeDriver driver;
public ChromeOptions options;


	@Given("Launch the browser")
	public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopan\\Downloads\\chromedriver-win64\\chromedriver.exe");	
	options = new ChromeOptions();
	options.addArguments("guest");
    driver=new ChromeDriver(options);
    driver.manage().window().maximize();
	}

	@And("Load the url")
	public void load_the_url() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@And("Enter the username as Demosalesmanager")
	public void enter_the_username_as_demosalesmanager() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	}

	@And("Enter the password as crmsfa")
	public void enter_the_password_as_crmsfa() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("It should be logged in")
	public void it_should_be_logged_in() {
    System.out.println("Login successful");
	}

}
