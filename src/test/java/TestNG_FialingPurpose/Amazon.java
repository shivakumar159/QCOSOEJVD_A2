package TestNG_FialingPurpose;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	@Test
	public void amazon() {

	
	WebDriverManager.edgedriver().setup();

	// to open the chrome  browser
	WebDriver driver=new EdgeDriver();

	//minimizing the browse
	driver.manage().window().maximize();

	//implicit wait statement
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	driver.get("https://www.amazon.co.uk/?tag=hydukabkm-21&ref=pd_sl_77c9n1dl2y_e&adgrpid=1174279317182338&hvadid=73392659552020&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=41471&hvtargid=kwd-73392595301339:loc-188&hydadcr=13724_2242080&msclkid=90c9499808981692341c2ffe06426cbb");
}
}
