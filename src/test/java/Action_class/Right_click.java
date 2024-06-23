package Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Right_click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.edgedriver().setup();

		// to open the chrome browser
		WebDriver driver=new EdgeDriver();

		//minimizing the browse
		driver.manage().window().maximize();

		//implicit wait statement
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.amazon.co.uk/?tag=hydukabkm-21&ref=pd_sl_77c9n1dl2y_e&adgrpid=1174279317182338&hvadid=73392659552020&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=41471&hvtargid=kwd-73392595301339:loc-188&hydadcr=13724_2242080");
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		
		Actions a=new Actions(driver);
		a.contextClick(search).perform();
	}

} 
