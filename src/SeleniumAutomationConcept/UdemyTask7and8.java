package SeleniumAutomationConcept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyTask7and8 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//First Assignment is to get the number of rows and no of column in the table and printing the 3rd row in output
		/*JavascriptExecutor js =(JavascriptExecutor)driver;  
		js.executeScript("window.scrollBy(0,500)"); 
		System.out.println("Number of Rows = "+driver.findElements(By.cssSelector(".table-display tbody tr")).size());
		System.out.println("Number of Columns = "+driver.findElements(By.cssSelector(".table-display tbody th")).size());
		System.out.println(driver.findElement(By.cssSelector(".table-display tbody tr:nth-child(3)")).getText());*/
		
		//2nd Assignment is to select a country from the Auto Suggestive Dropdown
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
		
		for(WebElement option:options)
		{
		  driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);  //used to get that keys to go down until the country is found
		  if(option.getText().equalsIgnoreCase("Tunisia"))
		  {
			  option.click();
			  break;
		  }
	}

  }
}
