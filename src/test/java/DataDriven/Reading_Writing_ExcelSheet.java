package DataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reading_Writing_ExcelSheet {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Textdata.xlxs.xlsx");
Workbook wb=WorkbookFactory.create(fis);
String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();

String password = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();

WebDriverManager.edgedriver().setup();

WebDriverManager.edgedriver().setup();

// to open the chrome browser
WebDriver driver=new EdgeDriver();

//minimizing the browse
driver.manage().window().maximize();

//implicit wait statement
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

driver.get(url);

driver.findElement(By.id("pass")).sendKeys(password);
String title = driver.getTitle();
wb.getSheet("Sheet1").createRow(6).createCell(1).setCellValue(title);
FileOutputStream fos=new FileOutputStream(".\\src\\\\test\\\\resources\\\\Textdata.xlxs.xlsx");
wb.write(fos);

	}

}
