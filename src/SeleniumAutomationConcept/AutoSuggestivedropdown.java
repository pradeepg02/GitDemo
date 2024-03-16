package SeleniumAutomationConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestivedropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind"); //used to type the word in that text box
		Thread.sleep(1000);
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")); //we used (driver.findelements) to get all the elements instead of findelement	
		//We are storing the elements in the list format and the variable name as options.
		
		for(WebElement option : options) //We are using enhanced for loop to take options to iterate in the name as option, webelement is used as return type
		{
			if(option.getText().equalsIgnoreCase("India")) //if statement is used to get the text and to match with the suggested text, so we used equalsignorecase
			{ //if its equal only, it will come in otherwise it won't
				option.click(); 
				break; //if it comes and click then it breaks and get out of the loop
			}
			
		}

	}

}
