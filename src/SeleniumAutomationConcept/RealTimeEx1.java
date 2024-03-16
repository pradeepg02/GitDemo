package SeleniumAutomationConcept;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealTimeEx1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size()); //To get the count of all the links in the page, if there is link, there is a tag, se we used that
		
		//System.out.println(driver.findElements(By.xpath("//div[@id='gf-BIG'] //a")).size()); //One way getting all the links for the footer section
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));  //Another way by creating an variable by limiting the scope as footerdriver and we are getting the link form that
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement columndriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")); //Same way as footerdriver we used as colum driver and we traversed from parent to child from table to that ul column and getting how many links in that column
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++) //For clicking every column i used for loop to iterate one by one
		{
			String Click = Keys.chord(Keys.CONTROL,Keys.ENTER); //Here we used ctrl and enter keys as used in keyborad and declared in a variable
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(Click);  //Sending that variable using send keys will click that links
			Thread.sleep(2000); //It is used to see just how it's clicking(not neeeded)			
		}	
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
			
		while(it.hasNext())  //while loop is used to iterate only when it has next index, that's y we used hasnext
			{
				driver.switchTo().window(it.next()); //it is used to switch to next(child) windows using it next
				System.out.println(driver.getTitle()); //This will get the title of each tab
			}
			

	}

}
