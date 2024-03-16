package SeleniumAutomationConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertcomponent {
	
	//This alert button will come sometimes at the top of the page, to ask ok or cancel

	public static void main(String[] args) throws InterruptedException {
		String name = "Sundar";
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click(); //If we click this button, that alert popup will come
		System.out.println(driver.switchTo().alert().getText()); //This is used to switch from browser to alert popup and getting that text
		driver.switchTo().alert().accept(); //Switching from browser to alert popup and accepting that button
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss(); //Switching from browser to alert popup and clcik the cancel button.
		driver.close();
		
		/*There are two varations 1) Only Ok button, 2) Ok and Cancel button
		 * If there is only ok button, we have to give accept
		 * If there are ok and cancel button, for positive responses(OK) we'll give accept and for negative(cancel), we'll give dismiss 
		 */

	}

}
