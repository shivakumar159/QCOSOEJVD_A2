package Pop_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDividion_popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		WebDriverManager.edgedriver().setup();

		// to open the chrome  browser
		WebDriver driver=new EdgeDriver();

		//minimizing the browse
		driver.manage().window().maximize();

		//implicit wait statement
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.redbus.in/");
		
		//address of date
		driver.findElement(By.xpath("//span[text()='Date']"));
		
		driver.findElement(By.xpath("//span[text()='27']/../../../../../../..")).click();
		
	}

}
