package BrowserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementPresent {
	public static WebDriver driver;
	
	public static boolean isElementPresent(By by) {
	
		try {
		driver.findElement(by);
		return true;
		}catch(Throwable t) {
			return false;
		}
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//peru//eclipse-workspace//SeleniumWebDriver//src//resources//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoproject.simplytest.de/");
		driver.manage().window().maximize();
		
		System.out.println(isElementPresent(By.id("site-header-cart")));

	}

}
