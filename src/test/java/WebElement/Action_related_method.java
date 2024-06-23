package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_related_method {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriverManager.edgedriver().setup();

//open the empty browser
WebDriver driver=new EdgeDriver();

//for maximizg
driver.manage().window().maximize();

//implicit wait
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//open the browser
driver.get("https://www.instagram.com/");

WebElement email=driver.findElement(By.id("email"));
email.sendKeys("kingshiva");
Thread.sleep(3000);
email.clear();

driver.findElement(By.xpath("//button[@type='submit']")).submit();

	}

}
