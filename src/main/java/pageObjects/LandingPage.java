package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	WebDriver driver;

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By SignIn = By.cssSelector("a[href*='sign_in']");
	By futurecourse=By.xpath("//div[@class='text-center']//h2");

	public WebElement signIn() {
		return driver.findElement(SignIn);
	}
	
	public WebElement getTittle() {
		return driver.findElement(futurecourse);
	}

}
