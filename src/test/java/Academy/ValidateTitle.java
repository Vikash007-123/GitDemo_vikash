package Academy;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPageObject;
import resources.Base;

public class ValidateTitle extends Base {
	
	@Test
	public void basePageNavigation() throws Exception {
		driver = intializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		LandingPage ld = new LandingPage(driver);
		ld.getTittle().getText();
		Assert.assertEquals(ld.getTittle().getText(),"FEATURED COURSES");
	}

}


