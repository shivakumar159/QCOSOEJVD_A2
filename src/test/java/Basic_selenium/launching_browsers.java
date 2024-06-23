package Basic_selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager; 

public class launching_browsers {
	
	public static void main(String[] args) throws Throwable
	{
		//driver relateb statement
		
		WebDriverManager.edgedriver().setup();
		
		//oprn the empty browser
		
		WebDriver driver = new EdgeDriver();
		
		Thread.sleep(3000);
		
		//for maximizng
		
		driver.manage().window().maximize();
	}

}
