package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Xpath {

	public static void main(String[] args) {
		
	WebDriverManager.edgedriver().setup();
		
		//opens the empty browser
		WebDriver driver = new EdgeDriver();
		// for maximizing
		driver.manage().window().maximize();
		
		//to open the browser
		driver.get("https://en-gb.facebook.com/");
	
		// address of email text files using xpath method
		
		driver.findElement(By.xpath("//input[@placeholder='Mobile number or email address']")).sendKeys("kingram");
		
		// address of password files by using xpath contains attribute
		
		driver.findElement(By.xpath("//input[@data-sigil='password-plain-text-toggle-input']")).sendKeys("shiva@1324");
		
		// address of forgetten password using xpath text
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	
		
	
	}

}
