package Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHovering {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.edgedriver().setup();

		// to open the chrome browser
		WebDriver driver=new EdgeDriver();

		//minimizing the browse
		driver.manage().window().maximize();

		//implicit wait statement
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.snapdeal.com/page/about-us/");
		WebElement signin=driver.findElement(By.xpath("//span[text()='Sign In']"));
		
		//creating an object for action class
		Actions a=new Actions(driver);
		a.moveToElement(signin).perform();
	Thread.sleep(3000);
	
	//address of register
	driver.findElement(By.xpath("//span[text()='Register']")).click();
		
 
	}

}
