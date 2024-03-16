package SeleniumAutomationConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocatorsConcepts2 {

	public static void main(String[] args) throws InterruptedException {
		
		String name = "Pradeep"; //we just created a seperate name and gave it in user name field
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pradeepg2\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //to wait for 5 seconds until it comes up
		String password = getPassword(driver); //this is a method that has the password, we called without object because we used static word
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name); //we gave by the locator id, to enter the name variable in text field
		driver.findElement(By.name("inputPassword")).sendKeys(password); //by locater name to give password
		driver.findElement(By.className("signInBtn")).click(); //by the locater class name, if there are 2 words in class, it means there are two classes
		
		Thread.sleep(1000); //used to wait untill it logged in
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in."); //This is testNG assertion, it will works only if we insert testng in maven dependencies, used to run if it's pass otherwise return error if it's fails
		//System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText()); //to print the name value
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+","); //using the test ng assertion to check that name is correct or not, it will not print anything
		driver.findElement(By.xpath("//*[text()='Log Out']")).click(); //another way of giving the xpath, just used to give that text for that we have to use * and no need for @ bcoz that text is not a attribute
        driver.close();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException //this is a method to get the password from the text given instead of hardcoding the password

	{
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	String passwordText =driver.findElement(By.cssSelector("form p")).getText();

	//Please use temporary password 'rahulshettyacademy' to Login.

	String[] passwordArray = passwordText.split("'");  //used to split that password alone

	// passwordArray2[0]

	String password = passwordArray[1].split("'")[0];

	return password;

	//0th index - Please use temporary password

	//1st index - rahulshettyacademy' to Login.



	//0th index - rahulshettyacademy

	//1st index - to Login.

	}

}
