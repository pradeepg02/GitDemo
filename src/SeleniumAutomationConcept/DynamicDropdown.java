package SeleniumAutomationConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='CJB']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); //index is used because we have two values as MAA in 1st and 2nd dropdown, we used extra () curly braces for index
		//the index is used because it throws an error without index a
		
		driver.findElement(By.xpath("//div[@class='right1'] //a[@value='BLR']")).click(); //This is the another method to use parent child traversing to select that value in dropdown
		// we have to use div because that is the parent, there is no id, so i used class and i gave the xpath for the country
		
		driver.findElement(By.className("ui-state-highlight")).click(); //we are giving some part of class name to clcik that current date
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
	}

}
