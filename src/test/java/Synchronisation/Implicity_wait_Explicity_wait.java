package Synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicity_wait_Explicity_wait {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		//open the empty browser
		WebDriver driver= new EdgeDriver();
		
		//for maximizing
		driver.manage().window().maximize();
		
		// for implicit wait
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// fro Expicity
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		// to open the browser
		
		driver.get("https://www.instagram.com/");
		WebElement email=driver.findElement(By.id("email"));
		wait.until(ExpectedConditions.visibilityOf(email));
		
		email.sendKeys("shivakumar");
		WebElement loginButton=driver.findElement(By.xpath("//input[@name='username']"));
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();
		
	}

}
