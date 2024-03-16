package SeleniumAutomationConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UdemyTask6 {
	
	/*
	 In this Assignment we are doing following things:
	 
	 * Selecting any check box
	 * Grabbing the label/text of the check box and putting in a variable
	 * Selecting the static dropdown by that text without hardcodding
	 * Putting the name in the text box by the text we got
	 * clicking the alert button and verifying that the text we got and that alert message text is correct or not
	 */

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String text = driver.findElement(By.xpath("//div/fieldset/label[@for='benz']")).getText();
		System.out.println(text);
		
		WebElement staticdropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByVisibleText(text);
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		String alert = driver.switchTo().alert().getText();
		
		if(alert.contains(text))
		{
			System.out.println("Alert Message is right");
		}
		else {
			System.out.println("Alert Message is wrong");
		}
	}

}
