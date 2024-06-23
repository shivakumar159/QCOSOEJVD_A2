package DataDriven;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reading_Properties {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
Properties p=new Properties();
FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");
p.load(fis);
String urlApp = p.getProperty("url");
String user = p.getProperty("username");
String password = p.getProperty("password");

WebDriverManager.edgedriver().setup();



WebDriverManager.edgedriver().setup();

// to open the chrome browser
WebDriver driver=new EdgeDriver();

//minimizing the browse
driver.manage().window().maximize();

//implicit wait statement
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

driver.get(urlApp);
driver.findElement(By.id("email")).sendKeys(user);
driver.findElement(By.id("pass")).sendKeys(password);
	}

}
