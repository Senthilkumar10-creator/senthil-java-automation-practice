package Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportCode {

	public static void main(String[] args) throws IOException {
		
		ExtentSparkReporter spark = new ExtentSparkReporter("reports/Spark.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(spark);
		
		ExtentTest test = extent.createTest("Sample Test").assignAuthor("Senthil").assignCategory("Regression");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		try {
			test.info("Navigate to Google Website: ");
			driver.get("https://www.google.com/");
			String screenshotPath = takeScreenshot(driver, "Google-Snap");
			test.pass("Test Passed!").addScreenCaptureFromPath(screenshotPath);
		} catch (Exception e) {
			String screenshotPath = takeScreenshot(driver, "Error-Snap");
			test.fail("Test Failed!").addScreenCaptureFromPath(screenshotPath);
		} finally {
			test.info("Browser Closed!");
			driver.quit();
		}
		
  extent.flush();
	}
	
	
	public static String takeScreenshot(WebDriver driver , String filename) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		String des = filename + ".png";
		File desPath = new File(des);
		FileHandler.copy(src, desPath);
		return des;
	}
	
	
	
	

}
