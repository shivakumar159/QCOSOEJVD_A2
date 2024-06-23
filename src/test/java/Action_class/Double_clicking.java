package Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_clicking {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub


		
		WebDriverManager.edgedriver().setup();

		// to open the chrome  browser
		WebDriver driver=new EdgeDriver();

		//minimizing the browse
		driver.manage().window().maximize();

		//implicit wait statement
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://demoapp.skillrary.com/product.php?product=java");
		
		WebElement plus = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		a.doubleClick(plus).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();
		
	
	}

} 
