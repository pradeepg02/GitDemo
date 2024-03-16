package SeleniumAutomationConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcepts3 {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\pradeepg2\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //used to maximize the window from normal view
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().to("https://usopen.com"); //navigate from one website to another website
		driver.navigate().back(); //Again navigating back to same website
		//driver.navigate().forward(); //forwarding again to that website
        

		
		//Interview Questions(these things are only done in CSS and not in CSS Selector but CSS is fast) 
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());  //to get the next button from the current button taht's y we used following sibling
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header")).getText()); //traversing from child to parent
		driver.close();
		
	}

}
