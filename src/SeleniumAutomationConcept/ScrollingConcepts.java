package SeleniumAutomationConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollingConcepts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;  //For Scrolling, we have to use JavaScript only		
		js.executeScript("window.scrollBy(0,800)");  //We can execute the window.scroll in console and can copy and paste over here
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000"); //This is used to scroll inside the table
		//querySelector is like CSS Selector only, we have give same as CSS only, but queryselector is from Javascript
		
		//To Add all the numbers in the 4th column of that table
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));  //we are traversing from parent so i take the parent's class name and used that column name td: and the nth clild is the index 4
		
		int sum = 0;  //declaring this variable so that is used to add the values
		for(int i=0; i<values.size(); i++)
		{
			sum = sum + Integer.parseInt(values.get(i).getText()); //Interger.parseint is used to convert the string to integer values then only we can add tat
		}
		
		System.out.println(sum);
		int total = Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(sum, total);
		
		
		
	}

}
