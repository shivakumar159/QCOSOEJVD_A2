package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.edgedriver().setup();
//to open the empty browser
WebDriver driver=new EdgeDriver();

//for maximizng
driver.manage().window().maximize();
//implicit wait
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//to open the browser
driver.get("https://en-gb.facebook.com/");
driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

//address of femail radio button
WebElement radio=driver.findElement(By.xpath("//input[@value='1']"));
radio.click();
if(radio.isSelected())
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}

	}

}
