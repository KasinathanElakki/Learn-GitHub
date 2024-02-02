package SeleniumTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleexamples {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium training\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("happy pongal");
		Thread.sleep(8000);
		List<WebElement> total = driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		
		System.out.println(total.size());
		for (WebElement webElement : total) {
			String value = webElement.getText();
			System.out.println(value);
		}
		driver.close();
		
	}

}
