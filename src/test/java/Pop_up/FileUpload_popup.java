package Pop_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		WebDriverManager.edgedriver().setup();

		// to open the chrome  browser
		WebDriver driver=new EdgeDriver();

		//minimizing the browse
		driver.manage().window().maximize();

		//implicit wait statement
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.foundit.in/web/en/home");
		driver.findElement(By.xpath("//a[@class='btn block resume-btn btn-orange mt20']")).click();
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\shiva kumar\\Videos\\Captures\\Resume\\resume 3 selenium");
	}

}
