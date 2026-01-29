package testPractice.seleniumPrac;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandleDemo {

	public static void main(String[] args) {

		String url = "https://www.tutorialspoint.com/selenium/practice/browser-windows.php";

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement newWindow = driver.findElement(By.xpath("//button[text()='New Window']"));
		wait.until(ExpectedConditions.elementToBeClickable(newWindow));
		newWindow.click();

		String mainWindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		String expectedWindow = "Selenium Practice - Web Tables";
		for (String window : windowHandles) {
			if (!window.equals(mainWindow)) {
				driver.switchTo().window(window);
				if (driver.getTitle().equals(expectedWindow)) {
					WebElement link = driver.findElement(By.xpath("//a[@class='external-link']"));
					link.click();
					break;
				}
			}
		}

	}

}
