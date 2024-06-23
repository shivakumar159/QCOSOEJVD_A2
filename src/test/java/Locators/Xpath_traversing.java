package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_traversing {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		// opens the empty browser
		WebDriver driver = new EdgeDriver();

		// for maximizng
		driver.manage().window().maximize();

		// to open the browser
		driver.get(
				"https://www.amazon.in/s?k=samsung+mobile&crid=DC1P55LL67BK&sprefix=sam%2Caps%2C197&ref=nb_sb_ss_ts-doa-p_2_3");
		WebElement value = driver.findElement(By.xpath(
				"//span[text()='Samsung Galaxy M13 (Stardust Brown, 4GB, 64GB Storage) | 6000mAh Battery | Upto 8GB RAM with RAM Plus']/../../../../../..//span[@class='a-price-whole']"));
		System.out.println(value.getText());
	}

}
