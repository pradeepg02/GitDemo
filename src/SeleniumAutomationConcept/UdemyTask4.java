package SeleniumAutomationConcept;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyTask4 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String Parentwindow = it.next();
		String Childwindow = it.next();
		driver.switchTo().window(Childwindow);
		System.out.println(driver.findElement(By.className("example")).getText());
		driver.switchTo().window(Parentwindow);
		System.out.println(driver.findElement(By.xpath("//div /h3")).getText());

		
		
	}

}
