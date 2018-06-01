package Com.Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.Utilis.Browsers;

public class Tesett {
	WebDriver driver;
	
	
	
	public Tesett()
	{
		Browsers b = new Browsers();

		this.driver = b.getBrowsers("FF");		 
	}
	
	@Test
	public void tert()
	{
		System.out.println("test");
		
		driver.get("https://mydreamstore.in/");
		
		System.out.println(driver.getTitle());
	}
	
	
	
	/*@BeforeClass
	public void bef()
	{
		System.setProperty("webdriver.chrome.driver","/usr/lib/chromium-browser/chromedriver");
		ChromeOptions options = new ChromeOptions();
		// options.addArguments("user-data-dir=C:/Users/user_name/AppData/Local/Google/Chrome/User Data");

		options.addArguments("user-data-dir=/home/giri/.config/chromium/Profile 8");
		options.addArguments("--start-maximized");
		options.addArguments("disable-infobars"); 
		driver = new ChromeDriver(options);
	}
	*/
	
	
	@AfterClass
	public void te()
	{
		driver.quit();
	}

}
