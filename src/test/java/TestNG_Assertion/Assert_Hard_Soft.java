package TestNG_Assertion;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert_Hard_Soft {
	
	 WebDriver driver;
@Test
	public void Fb()
	{

		WebDriverManager.edgedriver().setup();

		// to open the chrome  browser
		WebDriver driver=new EdgeDriver();

		//minimizing the browse
		driver.manage().window().maximize();

		//implicit wait statement
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://en-gb.facebook.com/");
		
		String title = driver.getTitle();
		//Hard Assert
		Assert.assertEquals(title, "shivatheking");  //we can use this line also but we have to close the softAssert line 37
		//soft assert
		//SoftAssert s=new SoftAssert(); //we can use this line also but we have to close the Hard Assert line 35
		System.out.println(driver.getCurrentUrl());
		
	}

	@Test
	public void closing() throws Throwable{
		Thread.sleep(3000);
		
	}
}
