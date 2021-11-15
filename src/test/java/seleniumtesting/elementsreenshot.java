package seleniumtesting;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class elementsreenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
		driver.get("https://www.way2automation.com/") ;
		//driver.get("https://www.way2automation.com/");
		//driver.quit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele= driver.findElement(By.xpath("//*[@id=\"ast-desktop-header\"]/div[2]/div/div/div/div/div[1]/div/div/span/a/img"));
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		BufferedImage fullimage = ImageIO.read(screenshot);
		Point point= ele.getLocation();
		int width = ele.getSize().getWidth();
		int height = ele.getSize().getHeight();
		BufferedImage eleimage= fullimage.getSubimage(point.getX(), point.getY(), width, height);
		ImageIO.write(eleimage, "jpg", screenshot);
		FileUtils.copyFile(screenshot, new File("C:\\executable\\er00.jpg"));
		

	}

}
