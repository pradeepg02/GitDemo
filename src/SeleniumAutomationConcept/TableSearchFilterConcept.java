package SeleniumAutomationConcept;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSearchFilterConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Banana"); //sending the text in search box
		List<WebElement> products = driver.findElements(By.xpath("//tbody/tr/td[1]"));  //getting that particular name column xpath, every products come under same column name
		List filteredlist = products.stream().filter(s->s.getText().contains("Banana")).collect(Collectors.toList()); //using streams we're filtering the product name after typing and collected it in a list
		Assert.assertEquals(products.size(), filteredlist.size()); //then we are comparing that both the size are same are not using testng assertion
		
	}

}
