package TestNG_Parallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Compatibility_parallel {
	@Parameters({"browsername"}) //give this once Converting into suite file

	@Test
	public void fb(String browser)
	{
		WebDriver driver;
		if(browser.equals("edge")) {
	
		
		WebDriverManager.edgedriver().setup();

		// to open the chrome  browser
		 driver=new EdgeDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\shiva kumar\\eclipse-workspace\\QCOSOEJVDA2\\src\\main\\resources\\chromedriver.exe");
			driver=new ChromeDriver();
		}

		//minimizing the browse
		driver.manage().window().maximize();

		//implicit wait statement
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://en-gb.facebook.com/");
}
}
