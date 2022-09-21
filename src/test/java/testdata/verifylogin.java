package testdata;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobjectmodel.loginxpath;
import resources.baseclass;
import resources.testdata;

public class verifylogin extends baseclass
{
	@Test
	public void login() throws IOException, InterruptedException
	{
		
		loginxpath lp=new loginxpath(driver);
		Thread.sleep(5000);
		lp.enterpass().sendKeys(testdata.password);
		lp.enteruser().sendKeys(testdata.username);
		
		
		
	}
	
	
	

}

	

