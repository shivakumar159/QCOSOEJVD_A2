package Pop_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownlod_popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.edgedriver().setup();

		// to open the chrome  browser
		WebDriver driver=new EdgeDriver();

		//minimizing the browse
		driver.manage().window().maximize();

		//implicit wait statement
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://demoapp.skillrary.com/feedback.php");
		driver.findElement(By.xpath("//input[@name='downloadInvoice']")).click();
	}

}
