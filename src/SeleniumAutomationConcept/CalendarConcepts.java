package SeleniumAutomationConcept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarConcepts {

	public static void main(String[] args) {
		
		/*
		 * This code will not run as there is problem in that website clicking, it was not clicking anywhere
		 * It is for just to see what is the code for the calendar selection
		 */

		WebDriver driver = new ChromeDriver();	
		
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May")) 
			/*This is used to select the month by it's name, We use negation to to click the next button to go to next month in the calendar
			 * If the month doesn't match, it will click the next button to go to next month and if it matches it will became false and the it will get out of the loop
			 */

		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		List<WebElement> dates= driver.findElements(By.className("day"));
		//Grab common attribute//Put into list and iterate
		int count=driver.findElements(By.className("day")).size();

		for(int i=0;i<count;i++)
		{
         String text=driver.findElements(By.className("day")).get(i).getText();
         if(text.equalsIgnoreCase("21"))
           {
            driver.findElements(By.className("day")).get(i).click(); //Used to click the current DATE
            break;
       }
      }
    }

}