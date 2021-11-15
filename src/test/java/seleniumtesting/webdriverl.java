package seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdriverl {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver webdriver=new ChromeDriver();
   		EventFiringWebDriver driver =new EventFiringWebDriver(webdriver);
		myTestListener listener =new myTestListener();
		driver.register(listener);
		driver.get("https:google.com");
		//driver.findElement(By.id("wrongid")).click();;
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("selenium");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
	}   

}
