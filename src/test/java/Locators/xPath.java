package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xPath {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		// opens the empty browser
		WebDriver driver = new EdgeDriver();

		// for maximizng
		driver.manage().window().maximize();

		// to open the browser
		driver.get("https://www.facebook.com/");
		//address of email text fiels using xpath method
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("asdfgh");
//address of password textfield using xpath contains attribute
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("asdfgh");
		//address of forrgetten ppassword with x path text
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		//address of forrgetten ppassword with x path text contains
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten ')]")).click();
	}

}
