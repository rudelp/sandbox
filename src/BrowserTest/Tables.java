package BrowserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//peru//eclipse-workspace//SeleniumWebDriver//src//resources//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.kicker.de/2-bundesliga/spieltag");
		driver.manage().window().maximize();
		
		WebElement rowNum = driver.findElement(By.xpath("//table[@class='kick__table kick__table--small kick__table--ranking']//tbody"));
		int size = rowNum.findElements(By.tagName("tr")).size();
		
		for(int i = 1; i<=size; i++) {
		String table = driver.findElement(By.xpath("//table[@class='kick__table kick__table--small kick__table--ranking']//tbody//tr[" + i + "]")).getText();
		System.out.println(table);
		}
	}
}
