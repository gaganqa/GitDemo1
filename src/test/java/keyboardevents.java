import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboardevents {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/") ;
		//driver.get("https://www.way2automation.com/");
		//driver.quit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("identifierId")).sendKeys("gaganjit.qa@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"initialView\"]/div[2]")).click();
        Actions action =new Actions(driver);
        action.sendKeys(Keys.chord(Keys.CONTROL+"a")).perform(); 
        action.sendKeys(Keys.chord(Keys.CONTROL+"c")).perform(); 
        driver.findElement(By.id("identifierId")).click();
        action.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform(); 
        
        //action.sendKeys(Keys.ENTER).perform();
        
        		
	}

}
