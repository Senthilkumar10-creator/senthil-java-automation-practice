package cucumber.stepDefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.hooks.hooksFile;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDefinition {

	WebDriver driver = hooksFile.driver;
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	@Given("User navigate into HRM Application login URL")
	public void user_navigate_into_hrm_application_login_url() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle, "OrangeHRM");
	}

	@When("^User enters the valid \\\"([^\\\"]*)\\\" in the username field$")
	public void user_enters_the_valid_in_the_username_field(String usr) {
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(usr);
	}

	@When("User enters the valid {string} in the password field")
	public void user_enters_the_valid_in_the_password_field(String pwd) {
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(pwd);
	}

	@Then("User clicks the login button")
	public void user_clicks_the_login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		loginBtn.click();
	}

	@Then("user successfully navigated into dashboard page")
	public void user_successfully_navigated_into_dashboard_page() {
		String dashboardText = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		Assert.assertEquals(dashboardText, "Dashboard");
		driver.close();
	}

	@When("User enters the invalid <{string}> in the username field")
	public void user_enters_the_invalid_in_the_username_field(String usr) {
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(usr);
	}

	@When("User enters the invalid <{string}> in the password field")
	public void user_enters_the_invalid_in_the_password_field(String pwd) {
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(pwd);
	}

	@Then("user should not navigated into dashboard page")
	public void user_should_not_navigated_into_dashboard_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement errormsgEle = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Invalid credentials']")));
		String invalidErrorMsg = errormsgEle.getText();
		Assert.assertEquals(invalidErrorMsg, "Invalid credentials");
		driver.close();
	}
	
	@When("User enters the valid credentials")
	public void user_enters_the_valid_credentials(DataTable dataTable) {
	 List  < Map <String, String> > table=    dataTable.asMaps(String.class, String.class);
	 String usr = table.get(0).get("username");
	 String pwd= table.get(0).get("password");
	 WebElement username = driver.findElement(By.name("username"));
	 username.sendKeys(usr);
	 WebElement password = driver.findElement(By.name("password"));
	 password.sendKeys(pwd);
	 
	}

}
