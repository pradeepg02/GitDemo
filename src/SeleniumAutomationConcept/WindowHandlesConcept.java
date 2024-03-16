package SeleniumAutomationConcept;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesConcept {
	/* Example of New windows
	 * In this Program, We are clicking the link in a given site and going to the child window
	 * In Selenium, Both new tab and new window is called as Child Window
	 * We are getting the windows and switch to child window and getting that email id and spliting and triming it
	 * We declare that in a variable
	 * We switching back to parent window again and entering that email id in username field
	 * This program is simply about going to child window and getting the emailid and coming back to parent and giving in username field
	 */

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> window = driver.getWindowHandles(); //This getWindowHandles is used to get both parent windows and child windows and we are declaring that in a variable that return type is set<string>
		Iterator<String> it = window.iterator(); //We are using iterator to switch thru the windows
		String Parentwindow = it.next(); //Here we are using it.next to switch to the first index and that is parent window and declaring it in a variable
		String Childwindow = it.next();  //Here we are using it.next to switch to the second index and that is child window and declaring it in a variable
		
		driver.switchTo().window(Childwindow); //Here it is used to switch to the child window to do the operations over there
		String Emailid = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(Parentwindow);
		driver.findElement(By.id("username")).sendKeys(Emailid);
	}

}
