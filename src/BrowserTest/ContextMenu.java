package BrowserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//peru//eclipse-workspace//SeleniumWebDriver//src//resources//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();

		WebElement img = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));
		Actions action = new Actions(driver);
		action.contextClick(img).perform();
		WebElement info = driver.findElement(By.id("dm2m1i1tdT"));
		WebElement inst = driver.findElement(By.id("dm2m1i1tdT"));
		action.moveToElement(info).perform();
		
	}

}
