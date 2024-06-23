package TestNG_Parallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_parallel_Distributed {
	
		@Test
		public void fb()
		{
			
			WebDriverManager.edgedriver().setup();

			// to open the chrome  browser
			WebDriver driver=new EdgeDriver();

			//minimizing the browse
			driver.manage().window().maximize();

			//implicit wait statement
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

			driver.get("https://en-gb.facebook.com/");

	}

}
