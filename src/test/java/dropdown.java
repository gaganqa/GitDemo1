import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.id("searchLanguage")).sendKeys("Dansk");
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		Select select = new Select(dropdown);
		//select.selectByVisibleText("Asturianu");
		//select.selectByValue("hi");
		java.util.List<WebElement> values =driver.findElements(By.tagName("option"));
		System.out.println("Total Values in drop down are :"+values.size());
		//System.out.println(values.get(0).getText());
		for(int i=0;i<70;i++) {
			System.out.println(values.get(i).getAttribute("lang"));
		System.out.println("printing links->");
		WebElement block =driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[7]/div[3]"));
		java.util.List<WebElement> list=block
				.findElements(By.tagName("a"));
		System.out.println("total links present on this page are ;"+list.size());
		for(WebElement lists : list) {
			System.out.println(lists.getText()+"URL IS ___"+lists.getAttribute("href"));
		}
		}
		
	}

}
