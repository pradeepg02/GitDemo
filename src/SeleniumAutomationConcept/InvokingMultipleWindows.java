package SeleniumAutomationConcept;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultipleWindows {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);  //used to open the new tab, we can alos give window inplace of Tab
		
		Set<String> window = driver.getWindowHandles(); //This getWindowHandles is used to get both parent windows and child windows and we are declaring that in a variable that return type is set<string>
		Iterator<String> it = window.iterator(); //We are using iterator to switch thru the windows
		String Parentwindow = it.next(); //Here we are using it.next to switch to the first index and that is parent window and declaring it in a variable
		String Childwindow = it.next();  //Here we are using it.next to switch to the second index and that is child window and declaring it in a variable
		driver.get("https://rahulshettyacademy.com/");
		String course = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();  //getting the text from the child window and saving it in a some variable
		driver.switchTo().window(Parentwindow); //switching to parent window
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(course);//getting the text box in parent window and pasting the text that we copied from child text
		
		//Screenshot of that element only
		
		File file = name.getScreenshotAs(OutputType.FILE);  //This is used to take the screenshot of a site, we have to give the return type as File only, we mentioned Outputas.file to get the screenshot as a file\
		FileUtils.copyFile(file,new File("logo.png"));  //It will get that element screenshot and it will paste in selenium only at the bottom or else we can give path also like we see in previous miscellineous topics lecture
		
		//Get height and width
		
		System.out.println(name.getRect().getDimension().getHeight());  //to get the height of the element(name text box)
		System.out.println(name.getRect().getDimension().getWidth());   //to get the width of the element(name text box)
		
		
	}

}
