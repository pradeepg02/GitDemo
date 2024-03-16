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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddtoCartMethod2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String[] items = { "Cucumber", "Carrot", "Beetroot" };
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		addItems(driver, items);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(5)); //Explicit Wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/select")));
		WebElement Staticdropdown = driver.findElement(By.xpath("//div/select"));
		
		Select dropdown = new Select(Staticdropdown);
		dropdown.selectByValue("India");
		System.out.println(dropdown.getFirstSelectedOption());
		driver.findElement(By.cssSelector(".chkAgree")).click();
		System.out.println(driver.findElement(By.cssSelector(".chkAgree")).isSelected());
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		driver.close();
	}

	public static void addItems(WebDriver driver, String[] items) {

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			int j = 0;
			String[] pname = products.get(i).getText().split("-");
			String veggies = pname[0].trim();

			List itemsNeeded = Arrays.asList(items);

			if (itemsNeeded.contains(veggies)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

			}

			if (j == items.length) {
				break;
			}

		}
	}

}
