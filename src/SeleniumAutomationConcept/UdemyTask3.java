package SeleniumAutomationConcept;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UdemyTask3 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		String[] phonetitle = {"iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry"};
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#okayBtn")));
		driver.findElement(By.cssSelector("button#okayBtn")).click();
		
		WebElement login = driver.findElement(By.xpath("//select[@data-style = 'btn-info']"));
		
		Select dropdown = new Select(login);
		dropdown.selectByIndex(2);
		
		driver.findElement(By.cssSelector("input[name='terms']")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h4.card-title")));
		List<WebElement> cards = driver.findElements(By.cssSelector("h4.card-title"));
		int j=0;
		for(int i=0; i<cards.size(); i++)
		{
			String name = cards.get(i).getText();
			List phones = Arrays.asList(phonetitle);
			if(phones.contains(name))
			{
				j++;
				driver.findElements(By.cssSelector("button.btn.btn-info")).get(i).click();
				
				if(j==phonetitle.length)
				{
					break;
				}
			}
		}
		
		System.out.println(driver.findElement(By.xpath("//a[@class= 'nav-link btn btn-primary']")).getText());
		driver.findElement(By.xpath("//a[@class= 'nav-link btn btn-primary']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn.btn-success")));
		driver.findElement(By.cssSelector("button.btn.btn-success")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("country")));
		driver.findElement(By.id("country")).sendKeys("ind");
		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class ='suggestions'] //li /a")));
	    List <WebElement> options = driver.findElements(By.xpath("//div[@class ='suggestions'] //li /a"));
	    
	    for(WebElement option : options)
	    {
	    	if(option.getText().equalsIgnoreCase("India"))
	    	{
	    		option.click();
	    		break;
	    	}
	    }
	    // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id='checkbox2']")));
	    driver.findElement(By.xpath("//label[@for='checkbox2']")).click();
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-success alert-dismissible']")));
	    System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
		
	
		 

	}

}
