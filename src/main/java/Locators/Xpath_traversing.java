package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Xpath_traversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.edgedriver().setup();

//opens the empty browser
WebDriver driver=new EdgeDriver();

//for maximizing
driver.manage().window().maximize();

//to open the beowser
driver.get("https://www.amazon.co.uk/LOreal-Revitalift-Hyaluronic-Anti-Wrinkle-Replumping/dp/B08XXRR15D/?_encoding=UTF8&_encoding=UTF8&ref_=dlx_gate_sd_dcl_tlt_fdbee75c_dt_pd_hp_d_btf_unk&pd_rd_w=4zhN6&content-id=amzn1.sym.91989b06-857b-4c2e-adbf-b71fd787c043&pf_rd_p=91989b06-857b-4c2e-adbf-b71fd787c043&pf_rd_r=Z5ZQT60DR2S1MAFMFQMF&pd_rd_wg=E1AhA&pd_rd_r=1341b8c6-1ea1-4c7d-a60d-09df1edc90bc");
	
	WebElement value=driver.findElement(By.xpath("//span[text()='        L’Oréal Paris Revitalift Filler Deep Replumping Anti-Ageing SPF50 Cream, UV Protection, Moisturising, Intensely Hydrates and Smooth Wrinkles with Macro, Micro and Micro-Epidermic Hyaluronic Acid, 50ml       ']/../../../..//label[@for='checkboxpctch7751373507720257']"));
System.out.println(value.getText());
	}
}


