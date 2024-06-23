package Generic_Libraries;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities {

// 1. mouse hovering10
public  void mouseHover (WebDriver driver, WebElement ele) {
 Actions a = new Actions (driver);
 a. moveToElement (ele) .perform() ;
}

// 2. double clicking

public void doubleClick (WebDriver driver, WebElement ele) {
Actions a = new Actions (driver);
a. doubleClick (ele) .perform();
}

// 3. Right clicking
public void rightClick (WebDriver driver, WebElement ele) {
Actions a = new Actions (driver) ;
a. contextClick (ele) .perform () ;
}

// 4. drag and drop

public void dragAndDrop (WebDriver driver, WebElement elel, WebElement ele2) {
Actions a = new Actions (driver);
a.dragAndDrop (elel, ele2) .perform();
}

//5 handling alter pop up clicking on ok
public void alter (WebDriver driver)
{
driver. switchTo().alert().accept();
}

//6 handling alter pop up clicking on ok

public void alterCancel(WebDriver driver) {

Alert a=driver.switchTo().alert();
System.out.println(a.getText());
a.dismiss();
}

//7 Child browser
public void childBrowser(WebDriver driver)
{
	Set<String> child=driver.getWindowHandles();
	for(String b:child) {
		driver.switchTo().window(b);
	}
	
}
//8 parent browser
public void parentBrowser(WebDriver driver)
{
	String parent=driver.getWindowHandle();
	driver.switchTo().window(parent);
}
//9 Explicit Wait
public void explicitwait(WebDriver driver,int t,WebElement ele)
{
	WebDriverWait wait=new WebDriverWait(driver,t);
	wait.until(ExpectedConditions.visibilityOf(ele));
}
}

