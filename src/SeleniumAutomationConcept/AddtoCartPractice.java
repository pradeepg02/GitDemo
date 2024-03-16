package SeleniumAutomationConcept;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddtoCartPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		/*WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(5)); 
		 * This is one form of Explicit wait, This is called WebdriverWait and another one is fluent wait
		// Explicit wait, we have to create this class to do explicit wait
		// Implicit wait is used bcoz it was taking only 5 seconds for everything so i commented this*/
		
		String[] itemsNeeded= {"Cucumber","Carrot","Tomato"};   //creating an array so that we can change any vegetable in future
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		int j=0;  //This is used to end the loop after clicking those vegetables in array
        Thread.sleep(3000);
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));  

		//Firstly I'm getting that Vegetables name and putting it in a for loop
		for(int i=0;i<products.size();i++)

		{

		String[] name=products.get(i).getText().split("-");  //I want to split the other words apart from that vegetables so i used split after and before -
		String formattedName=name[0].trim(); //There is a extra space there so i used trim, trim will remove ony one extra space 
		List itemsNeededList = Arrays.asList(itemsNeeded);  //i am changing that Array declared in the top to arraylist so only we can check that contains thing and also array list is easy to execute
		
		if(itemsNeededList.contains(formattedName))   //This condition statement is used to check that newcorrectedname is in that itemsneed arraylist or not
		{
		j++;  //Firstly I gave j=0, i am incrementing so that after all vegetables got over, it will end
		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();  //getting that add to cart button with the index(get(i)) and clicking that

		if(j==itemsNeeded.length)   //If that j matched with length(all items completed) of the arraylist, it will break from the loop
		{
		break;
		}
		
	  }
		
    }
		
		System.out.println(driver.findElement(By.className("cart-info")).getText());
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();		
		driver.findElement(By.xpath("//button[text() = 'PROCEED TO CHECKOUT']")).click();
		
		/*w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode"))); 
		//This is explicit wait condition, we called by obj name w, and that visibility of is used to wait until that text box is visible and it will start executing
		 * This visibilityofElementLocated is more important method used by everyone*/
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		/*w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));  
		//This is explicit wait condition, we called by obj name w, and that visibility of is used to wait until that text is visible and it will print that*/
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.findElement(By.xpath("//button[text() = 'Place Order']")).click();
		


  }
	
}

