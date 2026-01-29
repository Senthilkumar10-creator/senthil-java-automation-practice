package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day1 {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	 @Test(priority = 1)
	public void task1() {

		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");
	}

	 @Test(priority = 2)
	public void task2SuccessfulLogin() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}

	@Test(priority = 3)
	public void task2InvalidLogin() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

		String errorMsg = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		Assert.assertEquals(errorMsg, "Invalid credentials");
	}

	@Test(priority = 4)
	public void task3Locators() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

		driver.findElement(By.className("oxd-icon bi-caret-down-fill oxd-userdropdown-icon")).click();
		driver.findElement(By.linkText("Logout")).click();

	}

	@Test(priority = 4)
	public void task4countImages() {
		driver.get("https://www.bing.com/");
		driver.findElement(By.xpath("//*[@id='images']")).click();
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Count images: " + images.size());
	}

	@Test(priority = 5)
	public void task5getAddress() {
		driver.get("https://www.bing.com/");
		driver.findElement(By.xpath("//*[@id='sb_form_q']")).sendKeys("capgemini india Bangalore address");
		driver.findElement(By.xpath("//*[@id='search_icon']")).click();
		String text = driver.findElement(By.xpath("(//*[@class='b_factrow'])[1]")).getText();
		System.out.println("Captured Address : " + text);
	}

}
