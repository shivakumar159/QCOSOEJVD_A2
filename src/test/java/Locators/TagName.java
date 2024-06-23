package Locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//print all the links in an webpage
public class TagName {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();

		// upcating statement
		WebDriver driver = new EdgeDriver();
		// maximizing the window
		driver.manage().window().maximize();
		// use of get method
		driver.get("https://www.amazon.in/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		Thread.sleep(3000);
		for (WebElement b : allLinks) {
			System.out.println(b.getText());
		}
	}

}
