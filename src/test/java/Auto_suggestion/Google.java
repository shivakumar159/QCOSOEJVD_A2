package Auto_suggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {



	public static void main(String[] args) throws Throwable {
		
		
WebDriverManager.edgedriver().setup();

// to open the chrome browser
WebDriver driver=new EdgeDriver();

//minimizing the browse
driver.manage().window().maximize();

//implicit wait statement
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

driver.get("https://www.google.co.uk/");

driver.findElement(By.xpath("//textarea[@aria-label='Search']")).sendKeys("phone");

Thread.sleep(4000);
List<WebElement>allvalues=driver.findElements(By.xpath("//li[@data-view-type='1']"));
Thread.sleep(4000);

for(WebElement b:allvalues);

{
System.out.println("b.getText");
	}
Thread.sleep(4000);
driver.quit();

	}

}
