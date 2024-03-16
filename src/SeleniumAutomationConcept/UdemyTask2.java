package SeleniumAutomationConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UdemyTask2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Pradeep");
		driver.findElement(By.name("email")).sendKeys("pguvd@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Password");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement dropdown = driver.findElement(By.cssSelector("select[class='form-control']"));
		
		Select obj = new Select(dropdown);
		obj.selectByVisibleText("Male");
		
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).sendKeys("17/5/2023");
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		driver.close();
		

	}

}




