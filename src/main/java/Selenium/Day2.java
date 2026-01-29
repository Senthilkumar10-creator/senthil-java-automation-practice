package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day2 {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	//@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
	//@Test(priority = 1)
	public void task6ImplicityWait() {
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Selenium WebDriver");
		WebElement firstSearch = driver.findElement(By.xpath("//ul[@role='listbox']/li[1]"));
		String text = firstSearch.getText();
		System.out.println(text);
		firstSearch.click();
	}
	
	
	//@Test(priority = 2)
	public void task6ExplicitWait() {
		driver.get("https://www.google.com/");
		
		//Click a button only when it is clickable
		WebDriverWait wait = new WebDriverWait( driver , Duration.ofSeconds(15));
		WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
		search.sendKeys("Selenium WebDriver");
		
		//Print the text of an element once it is visible
		WebElement firstSearch = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']/li[1]")));
		String text = firstSearch.getText();
		System.out.println(text);
		firstSearch.click();
	}
	
	
	@Test
	public void task7RegistrationForm() throws InterruptedException {
		
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.sendKeys("Rohit");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastName.sendKeys("Sharma");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		address.sendKeys("Wankhede Stadium , Mumbai.");
		
		WebElement emailAddress = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		emailAddress.sendKeys("hitman267@gmail.com");
		
		WebElement phoneNum = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		phoneNum.sendKeys("9015267267");
		
		WebElement gender = driver.findElement(By.xpath("//input[@ng-model='radiovalue' and @value='Male']"));
		if(!gender.isSelected()) {
			gender.click();
		}
		
		WebElement selecthobbies1 = driver.findElement(By.xpath("//label[text()='Hobbies']/following::div//input[@value='Cricket']"));
		if(!selecthobbies1.isSelected()) {
			selecthobbies1.click();
		}
		
		WebElement selecthobbies2 = driver.findElement(By.xpath("//label[text()='Hobbies']/following::div//input[@value='Movies']"));
		if(!selecthobbies2.isSelected()) {
			selecthobbies2.click();
		}
		
		WebElement langauagedropdown = driver.findElement(By.xpath("//div[contains(@class,'autocomplete-multiselect')]"));
		langauagedropdown.click();
		
		
		
		WebDriverWait wait = new WebDriverWait( driver , Duration.ofSeconds(15));
		WebElement selecteLanguage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[contains(@class,'ui-autocomplete' )]/li/a[text()='English']")));
		String text = selecteLanguage.getText();
		System.out.println(text);
		selecteLanguage.click();
		
		driver.findElement(By.xpath("//label[text()='Skills']")).click();
		
		WebElement selectSkills = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select skillList = new Select(selectSkills);
		skillList.selectByVisibleText("APIs");
		
		WebElement selectMainCountry = driver.findElement(By.xpath("//select[@id='countries']"));
		Select CountryMainlist = new Select(selectMainCountry);
		CountryMainlist.selectByVisibleText("Select Country");

		
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='country']"));
		Select Countrylist = new Select(selectCountry);
		Countrylist.selectByVisibleText("India");
		
		WebElement selectyear = driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select yearList = new Select(selectyear);
		yearList.selectByVisibleText("2000");
		
		WebElement selectmonth = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		Select monthList = new Select(selectmonth);
		monthList.selectByVisibleText("March");
		
		WebElement selectdate = driver.findElement(By.xpath("//select[@ng-model='daybox']"));
		Select dateList = new Select(selectdate);
		dateList.selectByVisibleText("9");
		
		WebElement enterfirstPaswrd = driver.findElement(By.id("firstpassword"));
		enterfirstPaswrd.sendKeys("King@1234");
		
		WebElement enterSecPaswrd = driver.findElement(By.id("secondpassword"));
		enterSecPaswrd.sendKeys("King@1234");
		
		WebElement sumbitBtn = driver.findElement(By.id("submitbtn"));
		sumbitBtn.click();
		
		
		
		
	}
	
	

}
