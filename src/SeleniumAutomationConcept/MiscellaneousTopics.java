package SeleniumAutomationConcept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiscellaneousTopics {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://usopen.com/");
		driver.manage().deleteAllCookies(); //used to delete all the cookiees
		driver.manage().deleteCookieNamed("sessioninfo"); //used to delete only one cookie with the name
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //This is used to take the screenshot of a site, we have to give the return type as File only, we mentioned OutputType.file to get the screenshot as a file
		FileUtils.copyFile(src,new File("C:\\Users\\pradeepg2\\Pictures\\Saved Pictures\\Screenshot.png"));
		//FileUtils is a java package used to store the taken screenshot in a local, if that package is not there, we can go and download common.io package from google and we can add that in external jars(all the file not basic folders)
		//then src is the place where taken screenshot is there, and we have to give a new file location in pictures(it will work without any errors) and we have to give a name and extension(.png), then we can go there and see
		
				
		
	}

}
