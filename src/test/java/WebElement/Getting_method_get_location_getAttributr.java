package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getting_method_get_location_getAttributr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.edgedriver().setup();

//open the empty browser

WebDriver driver=new EdgeDriver();

//for maxmizing

driver.manage().window().maximize();

//implict wait

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


//to open the browser
driver.get("https://en-gb.facebook.com/");
WebElement email=(WebElement) driver.findElements(By.id("email"));
String attribute=email.getAttribute("type");
System.out.println(attribute);
Point coOrdinates=email.getLocation();
int x=coOrdinates.getX();
int y=coOrdinates.getY();
System.out.println(x);
System.out.println(y);
	}

}
