package BrowserTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Links {
	
	public static WebDriver driver = new ChromeDriver();
	
	//Änderung

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//peru//eclipse-workspace//SeleniumWebDriver//src//resources//chromedriver.exe");
		driver.get("https://demoproject.simplytest.de/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("orderby")).sendKeys("Nach Neuheit sortiert");
		
		
		
		WebElement block = driver.findElement(By.xpath("//ul[@class='nav-menu']"));
		int size = block.findElements(By.tagName("li")).size();
		for(int i = 0; i<size; i++) {
			System.out.println(block.findElements(By.tagName("li")).get(i).findElement(By.tagName("a")).getAttribute("href").toString());
		}
		
		
		
	}

}
