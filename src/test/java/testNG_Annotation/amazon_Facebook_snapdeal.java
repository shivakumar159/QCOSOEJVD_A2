package testNG_Annotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon_Facebook_snapdeal {
WebDriver driver;

@BeforeMethod
public void Openong()
{
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@AfterMethod
public void closing() {
	driver.close();
}
@Test
public void fb() {
	driver.get("https://en-gb.facebook.com/");
}
@Test
public void amazon() {
	driver.get("https://www.amazon.co.uk/?tag=hydukabkm-21&ref=pd_sl_77c9n1dl2y_e&adgrpid=1174279317182338&hvadid=73392656376578&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=41471&hvtargid=kwd-73392595301339:loc-188&hydadcr=13724_1861618&msclkid=a37d20d26b0612fa3e1846b78bbad939");
	
}
@Test
public void snapdeal() {
	driver.get("https://www.snapdeal.com/");
}
}