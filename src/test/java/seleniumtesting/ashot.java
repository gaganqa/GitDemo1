package seleniumtesting;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ashot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
		driver.get("https://www.way2automation.com/") ;
		//driver.get("https://www.way2automation.com/");
		//driver.quit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele= driver.findElement(By.xpath("//*[@id=\"ast-desktop-header\"]/div[2]/div/div/div/div/div[1]/div/div/span/a/img"));
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver,ele);
        ImageIO.write(screenshot.getImage(),"jpg", new File("C:\\executable\\errr.jpg"));
	}

}
