package BrowserTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//peru//eclipse-workspace//SeleniumWebDriver//src//resources//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://demoproject.simplytest.de/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("orderby")).sendKeys("Nach Neuheit sortiert");
		WebElement element = driver.findElement(By.name("orderby"));
		Select select = new Select(element);
		int size = select.getOptions().size();
		
		for(int i = 0; i<size; i++) {
			List<WebElement> inhalt = driver.findElements(By.tagName("option"));
			System.out.println(inhalt.get(i).getText());
			
		}
	}

}
