package testPractice.seleniumPrac;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.tutorialspoint.com/selenium/practice/alerts.php";

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement clickAlert = driver.findElement(By.xpath("//button[@type='button' and @onclick='showAlert()']"));
		wait.until(ExpectedConditions.elementToBeClickable(clickAlert));
		clickAlert.click();

		Alert alert = driver.switchTo().alert();

		alert.accept();
		System.out.println("Alert2 handled");

		WebElement clickAlert2 = driver.findElement(By.xpath("//button[@type='button' and @onclick='myDesk()']"));
		wait.until(ExpectedConditions.elementToBeClickable(clickAlert2));
		clickAlert2.click();

		wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		System.out.println("Alert2 handled");

		WebElement clickAlert3 = driver.findElement(By.xpath("//button[@type='button' and @onclick='myPromp()']"));
		wait.until(ExpectedConditions.elementToBeClickable(clickAlert3));
		clickAlert3.click();

		wait.until(ExpectedConditions.alertIsPresent());
		alert.sendKeys("Alert3 Handled in the prompt");
		Thread.sleep(3000);
		alert.accept();
		System.out.println("Alert3 handled");

	}

}
