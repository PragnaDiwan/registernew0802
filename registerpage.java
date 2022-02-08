package registeropen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerpage {
	
	static WebDriver driver;
	
	public registerpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	private By firstname=By.name("firstname");
	private By lastname=By.name("lastname");
	private By email=By.name("email");
	private By telephone=By.name("telephone");
	private By password=By.name("password");
	private By conpassword=By.name("confirm");
	private By subscribeyes=By.xpath("(//div[@class='col-sm-10']/label/input)[1]");
	private By agree=By.xpath("//input[@type='checkbox']");
	private By continuelink=By.xpath("//input[@type='submit']");
	private By accountext=By.xpath("(//h1)[2]");
	private By logoutlink= By.linkText("Logout");
	private By loginlink=By.linkText("Login");
	private By loginemail=By.id("input-email");
	private By loginpassword=By.id("input-password");
	private By Loginbtn=By.xpath("//input[@type='submit' and  @value='Login']");
	private By errormsg=By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	
	public void register()
	{
		driver.findElement(firstname).sendKeys("pragna");
		driver.findElement(lastname).sendKeys("diwan");
		driver.findElement(email).sendKeys("pragna1234@gmail.com");
		driver.findElement(telephone).sendKeys("8141143966");
		driver.findElement(password).sendKeys("global916");
		driver.findElement(conpassword).sendKeys("global916");
		driver.findElement(subscribeyes).click();
		driver.findElement(agree).click();
		driver.findElement(continuelink).click();
	}
	

	public void headertext()
	{
		String text=driver.findElement(accountext).getText();
		System.out.println(text);
		if(text.contains("Account"))
		{
			System.out.println("register is suceesful");
		}
	}
	public void logout()
	{
		driver.findElement(logoutlink).click();
	}
	
	public void loginlink()
	{
		driver.findElement(loginlink).click();
		
	}
	public void loginsucees()
	{
		driver.findElement(loginemail).sendKeys("pragna1234@gmail.com");
		driver.findElement(loginpassword).sendKeys("global916");
		driver.findElement(Loginbtn).click();
		WebElement logout=driver.findElement(logoutlink);
		if(logout.isDisplayed())
		{
			System.out.println("login is sucessfull");
		}
		else
		{
			System.out.println("login is not sucessfull");
		}
				
	}
	
	public void loginunsuccess()
	{
		driver.findElement(loginemail).sendKeys("pragna1234@gmail.com");
		driver.findElement(loginpassword).sendKeys("global9161");
		driver.findElement(Loginbtn).click();
		
		String text=driver.findElement(errormsg).getText();
		System.out.println(text);
		if(text.contains("No match"))
		{
			System.out.println("login not sucess");
		}
		
	}
}
