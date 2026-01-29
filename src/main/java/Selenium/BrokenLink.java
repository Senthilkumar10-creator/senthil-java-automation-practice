package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLink {

	WebDriver driver;

	@Test
	public void brokenLink() throws IOException {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Airtel Fiber", Keys.ENTER);

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {

			String urlLinks = link.getAttribute("href");
			System.out.println(urlLinks);
			if (urlLinks == null || urlLinks.isEmpty()) {
				System.out.println("Null or Empty Link");
				continue;
			}

			try {
				URL url = new URL(urlLinks);

				HttpURLConnection urlChk = (HttpURLConnection) url.openConnection();
				urlChk.setConnectTimeout(5000);
				urlChk.connect();

				if (urlChk.getResponseCode() >= 400) {
					System.out.println(url + " - Broken Link");
				} else {
					System.out.println(url + " - Valid Link");
				}
			} catch (Exception e) {
				System.out.println(urlLinks + " - Exception: " + e.getMessage());
			}

		}

		driver.quit();

	}

}
