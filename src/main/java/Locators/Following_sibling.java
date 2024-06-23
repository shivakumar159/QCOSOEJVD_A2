package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Following_sibling {

	public static void main(String[] args)
	{
		WebDriverManager.edgedriver().setup();
		{
			//opens the empty browser
			WebDriver driver=new EdgeDriver();
			
			//for maximize
			driver.manage().window().maximize();
			
			//to open the browser
			driver.get("https://www.amazon.co.uk/?tag=hydukabkm-21&ref=pd_sl_77c9n1dl2y_e&adgrpid=1174279317182338&hvadid=73392656376578&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=41471&hvtargid=kwd-73392595301339:loc-188&hydadcr=13724_1861618");
			driver.findElement(By.xpath("//a[text()='Music']/following-sibling::a[2]")).click();
			
		}

	}

}
