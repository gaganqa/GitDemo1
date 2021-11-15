package seleniumtesting;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testhandlingcalenders {
	static int targetday = 0;
	static int targetmonth =0;
	static int targetyear =0;
	static int currentday = 0;
	static int currentmonth =0;
	static int currentyear =0;
	static int jumpMonthsby=0;
	static boolean increment=true;
	
	           
	           
	public static void main(String[] args) {
		
    String datetoset="25/08/2021";
    getCurrentDateMonthandYear();
    System.out.println(currentday+"  "+currentmonth+"  "+currentyear);
    getTargetdaymonthyear(datetoset);
    System.out.println(targetday+"  "+targetmonth+"  "+targetyear);
    monthstojump();
    System.out.println(jumpMonthsby);
    System.out.println(increment);
    WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get") ;
	//driver.get("https://www.way2automation.com/");
	//driver.quit();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
	}
	public static void getCurrentDateMonthandYear() {
		Calendar cal = Calendar.getInstance();
		currentday= cal.get(Calendar.DAY_OF_MONTH);
		currentmonth=cal.get(Calendar.MONTH)+1;
		currentyear=cal.get(Calendar.YEAR);
		
	}
	public static void getTargetdaymonthyear(String dateString) {
		int firstIndex = dateString.indexOf("/");
		int lastIndex = dateString.lastIndexOf("/");
		
		String day = dateString.substring(0, firstIndex);
		targetday = Integer.parseInt(day);
		
		
		String month = dateString.substring(firstIndex+1, lastIndex);
		targetmonth = Integer.parseInt(month);
		
		
		String year = dateString.substring(lastIndex+1, dateString.length());
		targetyear = Integer.parseInt(year);

		
	}
	public static void monthstojump() {
		if((targetmonth-currentmonth)>0) {
			jumpMonthsby=targetmonth-currentmonth;
		}
		else{
			jumpMonthsby=currentmonth-targetmonth;
			increment=false;
			
		}
	}

}
