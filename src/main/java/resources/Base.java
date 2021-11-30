package resources;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	
	public WebDriver intializeDriver() throws Exception {
		
		Properties props=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\vikash\\selenium\\E2EProject\\src\\main\\java\\resources\\data.properties");
        props.load(fis);
        String browserName=props.getProperty("browser");
        if(browserName.equals("chrome")) {
        	System.setProperty("webdriver.chrome.driver",
    				"C:\\Users\\vikash\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    		 driver = new ChromeDriver();
        	
        }

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;

        
	}

}
