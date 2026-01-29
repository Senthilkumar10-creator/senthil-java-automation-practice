package Selenium.Practice;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelCode {

	@Test
	public void writeExcel() throws IOException {

		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\";
        String fileName = "SampleTestData.xlsx";

		XSSFWorkbook workBook = new XSSFWorkbook();
		XSSFSheet sheet = workBook.createSheet("Sheet1");

		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);

		cell.setCellValue("This is a new excel value");

		FileOutputStream fos = new FileOutputStream(filePath + fileName);

		workBook.write(fos);

		fos.close();

		workBook.close();

	}

}
