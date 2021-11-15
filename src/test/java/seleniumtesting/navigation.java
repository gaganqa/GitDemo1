package seleniumtesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.gmail.com/") ;
		//driver.get("https://www.way2automation.com/");
		//driver.quit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.way2automation.com/");
        driver.findElement(By.xpath("//*[@id=\"menu-item-1510\"]/a/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"menu-item-26069\"]/a/span[2]")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().refresh();
         
	}

}
