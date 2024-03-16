package SeleniumAutomationConcept;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver; // we have import this to access edge browser
import org.openqa.selenium.firefox.FirefoxDriver; // we have import this to access firefox browser


public class SelIntroduction {

	public static void main(String[] args) {
		
		/* Firefox driver is gecho
		System.setProperty("webdriver.gecho.driver", "C:\\Users\\pradeepg2\\Documents\\gechodriver");
		WebDriver driver = new FirefoxDriver(); */
		
		/*Edge driver
		System.setProperty("webdriver.edge.driver", "C:\\Users\\pradeepg2\\Documents\\edgedriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();*/

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pradeepg2\\Documents\\chromedriver\\chromedriver.exe");  //currently it was optional, we can run without this line also
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.usopen.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
