package Paramertization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testParameterization {
	@Parameters({"browser","evn"})
	@Test
	public void getBrowserName(String name,String evn) {
		System.out.println(name+"----"+evn);
	}

}
