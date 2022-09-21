package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginxpath {
	public WebDriver driver;
	private By user=By.xpath("//input[@id='username']");
	private By pass=By.xpath("//input[@id='password']");
	private By up=By.xpath("//a[@id='signup_link']");
	
	public loginxpath(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	}
	public WebElement enteruser()
	{
		return driver.findElement(user);
		
	}
	public WebElement enterpass()
	{
		return driver.findElement(pass);
		
	}
	public WebElement up()
	{
		return driver.findElement(up);
		
	}


}
