package Pop_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//WebDriverManager.edgedriver().setup();
		ChromeOptions options=new ChromeOptions();
		
options.addArguments("-disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva kumar\\eclipse-workspace\\QCOSOEJVDA2\\src\\main\\resources\\chromedriver.exe");
		
		// **the program is correct but the version of chrome is different i used win32 with different version.
		// ***but i have to use win64 with my updated verion 
		
		// to open the chrome  browser
		
		
		WebDriver driver=new ChromeDriver(options);

		//minimizing the browse
		driver.manage().window().maximize();

		//implicit wait statement
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.redbus.in/");
	}

}
