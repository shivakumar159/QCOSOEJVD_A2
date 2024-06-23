package TestNG_FialingPurpose;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
@Test
public void fb() {
	
	WebDriverManager.edgedriver().setup();

	// to open the chrome  browser
	WebDriver driver=new EdgeDriver();

	//minimizing the browse
	driver.manage().window().maximize();

	//implicit wait statement
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	driver.get("https://en-gb.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("shivaking");
}
}
