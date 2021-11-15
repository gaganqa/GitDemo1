package seleniumtesting;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testng {
	@Test(priority=1,groups= {"fuctional"})
	public void doUserReg() {
		System.out.println("user reg test excuted");
		Assert.fail("Failed test case***********");
	}
	@Test(priority=2,groups= {"smoke"})
	public void doLogin() {
		System.out.println("executing login test");
	                      }
	@Test(priority=3,groups= {"fuctional"})
	public void thirdtest() {
		System.out.println("executing third test");
	                      }
	@Test(priority=4,groups= {"bvt"})
	public void fourthtest() {
		System.out.println("executing forth test");
		Assert.fail("Failed test case***********");
	}

}
