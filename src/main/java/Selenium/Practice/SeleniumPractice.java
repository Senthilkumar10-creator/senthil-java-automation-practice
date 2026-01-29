package Selenium.Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumPractice {

	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		driver = new ChromeDriver();
		
		// driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		// frame url
		// driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
		
		// file upload url
		//driver.get("https://practice-automation.com/file-upload/");
		
		//Broken link 
		driver.get("https://www.google.com/search?q=airtel+fiber+plans");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown() {
		if (driver!=null) {
			driver.quit();
		}
	}

	@Test
	public void takeScreenshot() throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("src/main/resources/screenshot.png");
		FileHandler.copy(src, des);

	}

	// @Test
	public void javaScript() {

		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", loginBtn);
		js.executeScript("arguments[0].click();", loginBtn);
		js.executeScript("arguments[0].style.border='3px solid red'", loginBtn);

		WebElement input = driver.findElement(By.id("username"));
		js.executeScript("arguments[0].value='Senthil';", input);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,180);");
	}

	// @Test
	public void actionClass() throws InterruptedException {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));

		Actions action = new Actions(driver);
		action.moveToElement(loginBtn).click().build().perform();

		Thread.sleep(5000);
		action.moveToElement(loginBtn).contextClick().build().perform();

	}

	// @Test
	public void frames() {

		WebElement frame1Link = driver.findElement(By.xpath("//a[text()=' Selenium Tutorial']"));
		frame1Link.click();

	}

	// @Test
	public void windowHandles() {

		WebElement frame1Link = driver.findElement(By.xpath("//a[text()=' Selenium Tutorial']"));
		frame1Link.click();

		Set<String> windowIds = driver.getWindowHandles();

		List<String> windowIdList = new ArrayList<String>(windowIds);
		// String ParentId = windowIdList.get(0);
		String childId = windowIdList.get(1);

		for (String windowId : windowIdList) {
			System.out.println(windowId);
		}

		driver.switchTo().window(childId);

		WebElement selOverview = driver.findElement(By.xpath("//a[text()='Selenium - Overview']"));
		Actions action = new Actions(driver);
		action.moveToElement(selOverview).click();

	}

	// @Test
	public void readExcel() throws IOException {

		String path = "src/main/resources/Testdata.xlsx";
		FileInputStream fis = new FileInputStream(path);

		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workBook.getSheetAt(0);

		for (Row row : sheet) {
			for (Cell cell : row) {
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue() + "\t");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue() + "\t");
					break;
				default:
					System.out.print("Unknown\t");
				}
			}
			System.out.println();
		}

		workBook.close();
		fis.close();

	}

	 @Test
	public void writeExcel() throws IOException {

		// String path = "\\src\\main\\resources\\";
		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\";
		System.out.println(filePath);

		try {
			XSSFWorkbook workBook = new XSSFWorkbook();

			XSSFSheet sheet = workBook.createSheet("TestData");

			Row row = sheet.createRow(0);
			Cell cell = row.createCell(0);
			cell.setCellValue("Hello, Excel!");

			FileOutputStream out = new FileOutputStream(filePath + "SampleTestData.xlsx");

			workBook.write(out);
			out.close();
			workBook.close();

			System.out.println("Excel file written succesfully");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	//@Test
	public void fileUpload() {

		WebElement fileUpload = driver.findElement(By.xpath("//input[@id='file-upload']"));
		fileUpload.sendKeys("C:\\Users\\dsenthi1\\Desktop\\Testdatafile.txt");

		WebElement sumbitBtn = driver.findElement(By.xpath("//input[@id='upload-btn']"));
		sumbitBtn.click();

	}

	//@Test
	public void brokenLink() throws IOException {

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {

			String urllinks = link.getAttribute("href");
			if (urllinks == null || urllinks.isEmpty()) {
				System.out.println("Null or Empty links");
				continue;
			}

			try {
				URL url = new URL(urllinks);
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setConnectTimeout(3000);
				connection.connect();

				if (connection.getResponseCode() > 400) {
					System.out.println(url + "- Broken links");
				} else {
					System.out.println(url + "- Valid links");

				}
			} catch (Exception e) {
				System.out.println(urllinks + "- Exception " + e.getMessage());
			}

		}
		

	}

}
