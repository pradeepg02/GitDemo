package SeleniumAutomationConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsConcepts {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver); //Driver is used in argument because then only it will start that driver object
		
		WebElement var = driver.findElement(By.id("nav-link-accountList"));
	    a.moveToElement(var).build().perform();  //build is used to build the entire link for ready to perform but it will be executed only when we gave perform
        //built and perform is very important
	    
	    a.moveToElement(driver.findElement(By.cssSelector("input[placeholder='Search Amazon']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	    //This is used to give the Capital letter in Search box by using shift button and double clicking on that text to select instead of the many code
	    
	    a.moveToElement(var).contextClick().build().perform();  //context click is used to right click

	    
	    
	}

}
