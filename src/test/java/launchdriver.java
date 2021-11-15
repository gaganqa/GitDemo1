

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchdriver {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.edge.driver","C:\\executable\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.way2automation.com/");
		//driver.quit();
		//driver.manage().timeouts().implicitlyWait(10.timeuit)
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(title.length());
		Thread.sleep(2000);
		driver.close();

	}

}
