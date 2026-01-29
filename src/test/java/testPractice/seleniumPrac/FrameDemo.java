package testPractice.seleniumPrac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FrameDemo {

	public static void main(String[] args) {

		String url = "https://www.tutorialspoint.com/selenium/practice/frames.php";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();

		String actualHeader = driver.findElement(By.xpath("//h1[text()='Frames']")).getText();
		Assert.assertEquals(actualHeader, "Frames");
		System.out.println("Header validation is done");

		driver.switchTo().frame(0);
		System.out.println("switched to iframe 1");

		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'Selenium')]"));
		link.click();
		System.out.println("LINK CLICKED");

		driver.switchTo().defaultContent();

		String actualHeader1 = driver.findElement(By.xpath("//h1[text()='Frames']")).getText();
		Assert.assertEquals(actualHeader1, "Frames");

	}

}
