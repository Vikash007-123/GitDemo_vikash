package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	WebDriver driver;
	
	By email=By.cssSelector("input#user_email");
	By password=By.cssSelector("input#user_password");
	By login=By.cssSelector("input[type='submit']");
	
	public LoginPageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement getLoginByEmail() {
		return driver.findElement(email);
	}
	public WebElement getloginByPassword() {
		return driver.findElement(password);
	}
	public WebElement getLogin() {
		return driver.findElement(login);
	}
	
	

}
