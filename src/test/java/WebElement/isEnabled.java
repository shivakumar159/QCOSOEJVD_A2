package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.edgedriver().setup();

//open the empty browser
WebDriver driver=new EdgeDriver();

//for maximizng
driver.manage().window().maximize();
//implicit wait
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//to open the browser
driver.get("https://en-gb.facebook.com/");
WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
if(login.isEnabled())
{
	System.out.println("pass");
	login.click();
}
else {
	System.out.println("fail");
}
	}

}
