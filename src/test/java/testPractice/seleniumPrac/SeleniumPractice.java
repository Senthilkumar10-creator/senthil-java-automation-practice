package testPractice.seleniumPrac;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeleniumPractice {

	WebDriver driver;
	String url = "https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php";

	public WebElement locateElement(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement element = driver.findElement(By.xpath(xpath));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}

	public Select selectDropdown(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement element = driver.findElement(By.xpath(xpath));
		Select dropdown = new Select(element);
		return dropdown;
	}

	@Test
	public void registrationForm() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();

		WebElement userName = locateElement("//input[@id='name']");
		userName.sendKeys("Rohit");

		WebElement mailAdd = locateElement("//input[@id='email']");
		mailAdd.sendKeys("hitman264@gmail.com");

		WebElement clickGender = locateElement("//input[@id='gender']");
		clickGender.click();

		WebElement enterMobileNo = locateElement("//input[@id='mobile']");
		enterMobileNo.sendKeys("9726445264");

		WebElement enterSubject = locateElement("//input[@id='subjects']");
		enterSubject.sendKeys("Sports");

		List<WebElement> hobbyCheckBoxes = driver.findElements(By.xpath(
				"//label[text()='Hobbies:']/parent::div/child::div/descendant::div[@class='col-sm-3 text-left']/input"));

		for (WebElement element : hobbyCheckBoxes) {
			if (!element.isSelected()) {
				element.click();
			}
		}

		WebElement fileUpload = locateElement("//input[@type='file']");
		fileUpload.sendKeys("C:\\\\Users\\\\dsenthi1\\\\Desktop\\\\Testdata.txt");

		WebElement enterAddress = locateElement("//textarea[@id='picture']");
		enterAddress.sendKeys("Wankhede Stadium - Mumbai");

		Select selectCountry = selectDropdown("//select[@id='state']");
		selectCountry.selectByVisibleText("Rajasthan");

		Select selectCity = selectDropdown("//select[@id='city']");
		selectCity.selectByVisibleText("Lucknow");
	}

}
