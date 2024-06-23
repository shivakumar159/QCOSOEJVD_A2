package ScrollBar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrooing_wuthoutCoordinates {

	public static void main(String[] args)throws Throwable {
		
		WebDriverManager.edgedriver().setup();
	// to open the chrome  browser
	WebDriver driver=new EdgeDriver();

	//minimizing the browse
	driver.manage().window().maximize();

	//implicit wait statement
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.get("https://www.amazon.co.uk/?tag=hydukabkm-21&ref=pd_sl_77c9n1dl2y_e&adgrpid=1174279317182338&hvadid=73392656376578&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=41471&hvtargid=kwd-73392595301339:loc-188&hydadcr=13724_1861618&msclkid=66871cd35a4e1865ecba7aa44777b6cc");
	
	WebElement career=driver.findElement(By.xpath("//a[text()='Careers']"));
	
	//doowncasting
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();",career);
	Thread.sleep(3000);
	career.click();
}
}

