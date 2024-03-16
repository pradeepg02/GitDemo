package SeleniumAutomationConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown  { //with checkboxes also covered

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//TestNG Assertion, there are many assertions are there like assertfalse, we can see if we give (Assert.)
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); //This is used to test that the given statment is fals, if the given statement is false, it will go to next steps otherwise it will stops there, it can be used instead of printing the statement
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click(); //If we use *, we can put the partial name also from the class or id.
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); //To see that checkbox is selected or not
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()+" Checkboxes are there"); //This is used to check the size(how many are there) of the checkboxes
		
		driver.findElement(By.id("divpaxinfo")).click(); //for clicking that dropdown
		Thread.sleep(2000); //to wait until that dropdown is open
		
		for(int i=1;i<5;i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click(); //for clicking that + option, for clicking 5 times, i used for loop
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		}

}
