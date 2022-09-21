package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signupxpath {
	public WebDriver driver;
	By first=By.xpath("//input[@name='UserFirstName']");
	By last=By.xpath("//input[@name='UserLastName']");
	By emp=By.xpath("//select[@name='CompanyEmployees']");
	public signupxpath(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}
	public WebElement first()
	{
	return driver.findElement(first);
	}
	public WebElement last()
	{
	return driver.findElement(last);
	}
	public WebElement employees()
	{
	return driver.findElement(emp);
	}

}
