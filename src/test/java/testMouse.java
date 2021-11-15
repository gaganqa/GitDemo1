import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testMouse {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/") ;
		//driver.get("https://www.way2automation.com/");
		//driver.quit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://www.google.com/") ;
        driver.findElement(By.name("q")).sendKeys("way2automation");
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='lJ9FBc']/center/input[@value='Google Search']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='TbwUpd NJjxre']/cite[text()='https://www.way2automation.com']"))).click();
        WebElement ele=driver.findElement(By.xpath("//li[@id='menu-item-25091']/a[@class='menu-link']/span[text()='Resources']"));
        Actions action =new Actions(driver);
        action.moveToElement(ele).build().perform();
        
        
	}

}
