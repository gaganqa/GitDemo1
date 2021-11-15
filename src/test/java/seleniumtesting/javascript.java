package seleniumtesting;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascript {
	static WebDriver driver;
    public static void captureSreenshot() throws IOException {
    	Date d = new Date();
		String name =d.toString().replace(" ", "-")+".jpg";
    	File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshot, new File("C:\\executable\\"+name
	    		));
    }
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get") ;
		//driver.get("https://www.way2automation.com/");
		//driver.quit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("myFunction()");
		js.executeScript("arguments[0].style.border = '3px solid blue'",driver.findElement(By.id("mySubmit")));
	   // File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	   // FileUtils.copyFile(screenshot, new File("C:\\executable\\error.jpg"));
		captureSreenshot();
		
	}

}
