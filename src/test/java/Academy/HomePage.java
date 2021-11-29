package Academy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPageObject;
import resources.Base;

public class HomePage extends Base {
	@Test(dataProvider = "getData")
	public void basePageNavigation(String username, String password) throws Exception {
		driver = intializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		LandingPage ld = new LandingPage(driver);
		ld.signIn().click();
		LoginPageObject il = new LoginPageObject(driver);
		il.getLoginByEmail().sendKeys(username);
		il.getloginByPassword().sendKeys(password);
		il.getLogin().click();

	}

	@DataProvider
	public Object[][] getData() {

		Object[][] data = new Object[2][2];
		data[0][0] = "vkrabc123@gmail.com";
		data[0][1] = "vikash@123";
		data[1][0] = "vkrabc.com";
		data[1][1] = "vikash";
		return data;

	}

}
