package Pop_up;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowser_popup {

	

	public static void main(String[] args) throws Throwable {

		WebDriverManager.edgedriver().setup();

		// to open the chrome  browser
		WebDriver driver=new EdgeDriver();

		//minimizing the browse
		driver.manage().window().maximize();

		//implicit wait statement
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.skillrary.com/");
		String parent= driver.getWindowHandle();
		
		
		driver.findElement(By.xpath(" //a[text()=' GEARS ']")).click();
		
		driver.findElement(By.xpath("( //a[text()=' SkillRary Essay'])[2]")).click();
		
		 Set<String> child = driver.getWindowHandles();
		
		for(String b:child) {
		
		
		driver.switchTo().window(b);
		
	}
        driver.findElement(By.id("mytext")).sendKeys("shiva");
        Thread.sleep(2000);
        driver.switchTo().window(parent);
        driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();

		
		

	}
 
}
