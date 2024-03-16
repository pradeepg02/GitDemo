package SeleniumAutomationConcept;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinkConcepts {

	public static void main(String[] args) throws MalformedURLException, IOException {

		//We have find the broken link(url) so we used like this
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.cssSelector("li[class = 'gf-li' ] a"));
		SoftAssert a = new SoftAssert();
		
		for(WebElement link:links)
		{
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			//Firstly we have to call the openConnection method, that was present in URL Class, so we declared that as object and we write as object(URL).method(openconnection)
			//The Method's return type is HttpURLConnection and we casting the same in right side
			
			conn.setRequestMethod("HEAD");  //We are getting the request method as head(we can use get also), so that it will give the response code instead of other methods like get,put etc...
			conn.connect(); //to connect to that network
			int connectionstatus = conn.getResponseCode(); //used to get the response code
			System.out.println(connectionstatus);
			a.assertTrue(connectionstatus < 400, "The link with the text "+ link.getText() +" is with the response code "+connectionstatus);    //first argument is condition, second is print statement
			//Normally it is hard assertion only, but we created a soft assertion obj at top, so we called here, so it became soft assertion
			/* This is Soft Assertion
			 * We created softAssert object at the top and called the object a here
			 * We gave the condition to less that 400, even if it is greater than 400, it will execute untill all the links done
			 * After all the links got executed, it will give the output for failed links as these links are failed with the given text at right
			 */ 
				}
		
		a.assertAll(); //this is the text will give the failed links text at the last
		
		//DIFF btw hard and soft assertion in testng is
		//1) If error comes, hard assertion will stop and return a error
		//2) In Soft assertion, it will execute everything and it will returns arror only at the last
	}

}
