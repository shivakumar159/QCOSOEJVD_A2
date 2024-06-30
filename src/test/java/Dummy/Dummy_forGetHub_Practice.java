package Dummy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy_forGetHub_Practice {


	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub


		// This program only for practice  
		// in the getHub
		
	
	WebDriverManager.edgedriver().setup();

	// to open the chrome  browser
	WebDriver driver=new EdgeDriver();

	//minimizing the browse
	driver.manage().window().maximize();

	//implicit wait statement
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	driver.get("https://demoapp.skillrary.com/product.php?product=java");
	
}
}