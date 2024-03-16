package SeleniumAutomationConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyTask5 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name= 'frame-middle']")));
		System.out.println(driver.findElement(By.id("content")).getText());
		driver.switchTo().defaultContent();
	}

}
