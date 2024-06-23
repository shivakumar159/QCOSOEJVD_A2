package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_Name_LinkText_PartialLinkText {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		// opens the empty browser
		WebDriver driver = new EdgeDriver();

		// for maximizng
		driver.manage().window().maximize();

		// to open the browser
		driver.get("https://www.facebook.com/");
		// address of email text field
		driver.findElement(By.id("email")).sendKeys("asdfghjkl");
		// addreess of password text field
		driver.findElement(By.name("pass")).sendKeys("sdfgh");
		// address of login button
		driver.findElement(By.name("login")).click();

		// address of forgetten password link
		// driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("?")).click();

	}

}
