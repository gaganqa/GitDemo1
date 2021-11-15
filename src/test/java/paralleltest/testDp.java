package paralleltest;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testDp {
    @Test(dataProvider="getdata")
	public void doLogin(String b) throws InterruptedException {
		Date d = new Date();
		System.out.println("Browser name -"+b+"---"+d);
		Thread.sleep(3000);
                                                              }
		
    @DataProvider(parallel=true)                                                      
    public Object[][] getdata(){
    	Object[][] data= new Object[2][1];
    	data[0][0]="firefox";
    	data[1][0]="chrome";
		return data;
    	
                               }
                     }
