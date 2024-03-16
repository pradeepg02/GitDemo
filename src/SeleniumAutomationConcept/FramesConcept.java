package SeleniumAutomationConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());  //This is used to find out how many iframes are there in the web page, if there are more then we can switch with the index
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));  //The container is in frame, we can know by seeing the HTML Code, So I am switching that to Iframe using Webelement		
		
        //driver.switchTo().frame(0);  //Another method for Switching to frames using index instead of webelement
		
        driver.findElement(By.id("draggable")).click();  //Sample code for clicking that box to check that it throws error or not
		Actions a = new Actions(driver);  //We have to declare actions to perform drag and drop
		WebElement Sourcebox = driver.findElement(By.id("draggable"));
		WebElement Destinationbox = driver.findElement(By.id("droppable"));
		a.dragAndDrop(Sourcebox, Destinationbox).build().perform();  //in drag and drop, we are giving source and destination's webelement link
		driver.switchTo().defaultContent(); //This is used to switch back to default content from frames
	}

}
