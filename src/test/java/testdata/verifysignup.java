package testdata;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjectmodel.loginxpath;
import pageobjectmodel.signupxpath;
import resources.baseclass;
import resources.testdata;

public class verifysignup extends baseclass
{
	@Test
	public void signup() throws IOException, InterruptedException
	{
		
		loginxpath lp=new loginxpath(driver);
		lp.up().click();
		Thread.sleep(5000);
		signupxpath sp=new signupxpath(driver);
		sp.first().sendKeys(testdata.fname);
		sp.last().sendKeys(testdata.lname);
		Select s=new Select(sp.employees());
		s.selectByIndex(testdata.n);
		
		
	}

}
