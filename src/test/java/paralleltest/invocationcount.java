package paralleltest;

import org.testng.annotations.Test;

public class invocationcount extends testBase {
	int count =0;
	@Test(invocationCount=5,threadPoolSize=3)
	public void t() {
		//count++;
		//System.out.println("launching browser for "+count+"time");
		driver= getDriver("firefox");
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	                 }

}
