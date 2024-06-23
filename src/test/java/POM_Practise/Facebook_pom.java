package POM_Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import POM.FacebookLogin_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_pom {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();

		// to open the chrome  browser
		WebDriver driver=new EdgeDriver();

		//minimizing the browse
		driver.manage().window().maximize();

		//implicit wait statement
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://en-gb.facebook.com/");
		FacebookLogin_Page flp=new FacebookLogin_Page(driver);
		flp.emailTextfield("shiva");
		flp.passwordTextfield("king");
		flp.loginButton();
		
		
	}

}
