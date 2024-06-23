package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getSize {

	public static void main(String[] args) {
		
WebDriverManager.edgedriver().setup();
//open the empty browser
WebDriver driver=new EdgeDriver();

//fro maximizng
driver.manage().window().maximize();

//implicit wait
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//to open the browser
driver.get("https://www.amazon.co.uk/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2F%3Ftag%3Dhydukabkm-21%26ref%3Dnav_ya_signin%26adgrpid%3D1174279317182338%26hvadid%3D73392656376579%26hvnetw%3Do%26hvqmt%3De%26hvbmt%3Dbe%26hvdev%3Dc%26hvlocint%3D%26hvlocphy%3D41471%26hvtargid%3Dkwd-73392595301339%3Aloc-188%26hydadcr%3D13724_1861620&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=gbflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
WebElement email=driver.findElement(By.id("email"));
Dimension size=email.getSize();
int h=size.getHeight();
int g=size.getWidth();
System.out.println(h);
System.out.println(g);

	}

}
