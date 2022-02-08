package registeropen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {
	
	WebDriver driver;
	
	@Test
	public void loginsetup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
	
		driver.manage().window().maximize();
		registerpage r1= new registerpage(driver);
		
		//r1.register();
	//	r1.headertext();
		//r1.logout();
		r1.loginlink();
		//r1.loginsucees();
		r1.loginunsuccess();
		
		
	}
	


}
