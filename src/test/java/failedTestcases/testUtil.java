package failedTestcases;

import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class testUtil extends testBase {
	public static String mailscreebshot;
	public static void capturescreenshot(String methodname) {
		Calendar cal = new GregorianCalendar();
		int month =cal.get(Calendar.MONTH);
		int year =cal.get(Calendar.YEAR);
		int date =cal.get(Calendar.DATE);
		int day =cal.get(Calendar.HOUR_OF_DAY);
		int min =cal.get(Calendar.MINUTE);
		int sec=cal.get(Calendar.SECOND);
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		mailscreebshot=System.getProperty("user.dir")+"\\screenshot\\"+methodname+"  "+year+"-"+date+"-"+(month+1)+"-"+day+"-"+min+"-"+sec+".jpeg";
		FileUtils.copyFile(srcfile, new File(mailscreebshot));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
