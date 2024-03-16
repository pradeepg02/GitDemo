package SeleniumAutomationConcept;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebtableSortingusingStreams {

	public static void main(String[] args) {
		
		/* In this Program, We used two parts, 1) Sorting and 2)Paggination
		 * In this Program, We are clicking the first column, so the name will sort
		 * Then we are getting that all the veggies text 
		 * After that, with that text got, we are sorting that text
		 * Then we are comparing with the testng assertion
		 */

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();  //To Click on the colum to sort
		
		List<WebElement> elements = driver.findElements(By.xpath("//tbody/tr/td[1]"));  //getting that first column to see the order
		
		List<String> OrginalList = elements.stream().map(s->s.getText()).collect(Collectors.toList());  //converted to list, so used collectors.tolist
		
		List<String> ExpectedList = OrginalList.stream().sorted().collect(Collectors.toList());  //Sorted list
		
		//Assert.assertEquals(ExpectedList, OrginalList);   Another way to check expected and actual result
		Assert.assertTrue(OrginalList.equals(ExpectedList)); //Checking whether the sortedlist and the list we got are same are not using assertion
		List<String> price;  //we have declare the variable to use inside the loop outside so i declared here
		do {  //paggination

		List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		price = rows.stream().filter(s->s.getText().contains("Wheat")).map(s->getPriceVeggie(s)).collect(Collectors.toList()); //Fitering by the veggie name take it as list and from the getpriceVeggie function, we're shifting to following sibling and getting the price
		price.forEach(a->System.out.println(a));
		
		if(price.size()<1) //if that product is not in first page, using if stmt we clicked the next statment and it was not there also we are iterating using while loop untill we got the product
		{
		   driver.findElement(By.cssSelector("a[aria-label='Next']")).click();  //clicking the next button
		}
	}while(price.size()<1);  //keeps on iterating until we get the product
	}



public static String getPriceVeggie(WebElement s)  //method id created to get the price of that found product
//we gave webelement s because it contains stream and string is the return type
{
	String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();  //we are finding element using s.findelement because we are moving to price inside the stream, if we use driver, it will come from the beggining and it'll not work
	return pricevalue; //return the value to print inside main metod
	
}
}
