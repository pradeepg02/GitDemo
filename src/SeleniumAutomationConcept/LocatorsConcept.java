// Refer notebook for the explanation and the syntax
package SeleniumAutomationConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pradeepg2\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //to wait for 5 seconds until it comes up
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Pradeep"); //we gave by the locator id, to enter the name  in text field
		driver.findElement(By.name("inputPassword")).sendKeys("helloworld"); //by locater name to give password
		driver.findElement(By.className("signInBtn")).click(); //by the locater class name, if there are 2 words in class, it means there are two classes
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); //this is using css selector, if we don't have id,class or name
		//we are printing this to see what is the error, it comes after 2 seconds after clicking so we used timeout method 

		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);  //Added this because it's a single page application and the button is clicked even before it moves fully, so we applied a wait to click that button
		driver.findElement(By.xpath("//input[@placeholder = 'Name']")).sendKeys("Sam"); //xpath locator 
		driver.findElement(By.xpath("//input[@type = 'text'][2]")).sendKeys("samc@gmail.com"); //if there is no placeholder, we can use the indexing like this, but if we didn't give the index, it will go to some other text box
		driver.findElement(By.cssSelector("input[placeholder = 'Phone Number']")).sendKeys("9898998899");//with css selector locator
		driver.findElement(By.xpath("//input[@type = 'text'][3]")).clear(); //just used to clear the text box using index
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9739372927"); //this is by just using the tags, the form is the parent tag and followed by / and child name is input. we're using just tags
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); //using css selector, we used to click the button with class name. it's not necessary to give tagname sometimes
		
		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText()); //used to enter the final text recived after resetting the pwd
		driver.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(1000); //as it is a single page application, that bar moves left and right so we have to take 1 sec break until that bar moves right then only we can click, that's y we used this sleep command
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Pradeep");
		driver.findElement(By.cssSelector("input[type*=pass]")).sendKeys("rahulshettyacademy"); //This is partial link text, we use type and * to get that partial text, we have to enter four words with star compulsory
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click(); //this is use of contains keyword with xpath, we just give attribute name(class) and that containing value submit, another way in xpath and cssselector
		driver.close();


		
	}

}
