package resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class commonUtilities {
	public static void dropdown(WebElement dxpath)
	{
		Select s=new Select(dxpath);
		s.selectByIndex(0);
		
	}

}
