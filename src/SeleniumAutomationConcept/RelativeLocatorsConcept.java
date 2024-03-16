package SeleniumAutomationConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;  //have to manually import the package, we can serach on google and find this


public class RelativeLocatorsConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement aboveexample = driver.findElement(By.cssSelector("input[name='name']")); //Above example
		System.out.println(driver.findElement(with(By.tagName("label")).above(aboveexample)).getText());  //used to get the text above that name text field
		
		WebElement dob = driver.findElement(By.cssSelector("label[for='dateofBirth']")); //Below Example
		driver.findElement(with(By.tagName("input")).below(dob)).click(); //This will not click the below dob element, because it is flex, So it will click Submit
		//Relative xpath doen't work in flex component, it was a disadvantage(maybe)
		
		WebElement leftexample = driver.findElement(By.cssSelector("label[for='exampleCheck1']")); //left example
		driver.findElement(with(By.tagName("input")).toLeftOf(leftexample)).click(); //click the check boc left of the text
		
		WebElement rightexample = driver.findElement(By.id("inlineRadio1")); //Right example
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rightexample)).getText()); //used to get the text right of the radio button
	}

}
