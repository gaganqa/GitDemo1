package failedTestcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class logInTest extends testBase {
	@Test
	public void doLogin() {
		driver.findElement(By.id("login-username1")).sendKeys("gagan_cdn");
		driver.findElement(By.id("login-signin")).click();
	                      }
	@Test
	public void composeEmail() {
		Assert.fail();
	}

                       }
