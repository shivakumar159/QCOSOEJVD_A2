package Pop_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import Generic_Libraries.WebDriverUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_popup {

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

	//here we using **Generic Libraries instead all other below method//* //* we calling **WebDriverUtilities.java
	
	WebDriverUtilities ut1=new WebDriverUtilities();
	ut1.alter(driver);
	
	
	//**
	//switching the control.
	
	//Alert a1=driver.switchTo().alert();
	//Thread.sleep(3000);
	//System.out.println(a1.getText());
	
	//a1.accept();// here when the popup on the scrren it will click on OK()accept
	//** so i did accept and it add to cart we can see on the screen 
	

	
	//a1.dismiss();
	
	//here when the popup on the scrren it will click on cancel(dismiss), and it will not add to cart
	//so here we can see i gave //a1.dismiss it will not work 
	//**
	}

}
