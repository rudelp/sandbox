package BrowserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserTest {
	
	public static String browser = "chrome";
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		
		}else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C://Users//peru//eclipse-workspace//SeleniumWebDriver//src//resources//chromedriver.exe");
			driver = new ChromeDriver();
			}
		
		driver.get("https://demoproject.simplytest.de/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Mein Konto")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username"))).sendKeys("peter.rudel@interface-ag.de");
		//driver.findElement(By.id("username")).sendKeys("peter.rudel@interface-ag.de");
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.partialLinkText("Startseite")).click();
		driver.findElement(By.xpath("//*[@data-product_sku=\"woo-hoodie-with-zipper\"]")).click();
		
	}
}
