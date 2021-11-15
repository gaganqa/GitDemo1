import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtables {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		//driver.quit();
		System.out.println("-----");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> rownum =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
        System.out.println("total number of rows are -:"+rownum.size());
        List<WebElement> colnum=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
        System.out.println("total number of coloum -:"+colnum.size());
        for(int i=1;i<=rownum.size();i++)  
        {
        	for(int j=1;j<=colnum.size();j++) {
        		System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]")).getText()+"     ");
        	}
        	System.out.println();
        }
        
	}

}
