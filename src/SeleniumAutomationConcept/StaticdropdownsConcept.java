//Refer notebook to see the explanation
package SeleniumAutomationConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticdropdownsConcept {

	public static void main(String[] args) {
        
		WebDriver driver = new ChromeDriver();		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement Staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); //assigning to variable and webelement is a return type 
		
		Select dropdown = new Select(Staticdropdown); //creating object and assigning that variable
		dropdown.selectByIndex(3); //using objects and there are many items
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.close();
		
	}

}
