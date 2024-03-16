package SeleniumAutomationConcept;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeOptions;
//import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCertificationConcept {

	public static void main(String[] args) {
		
		/*This is used because in few internal project sites there it will show some warning for the certifications
		 *  In that time, we don't have to automate that, we just have to create this chromeoptions object
		 *  Then we have to give the setacceptinsecurecerts(true) and we have to give our object as argument in driver
		 *  So those error warning will not show
		 *  If failed to do so, it will show error or will not display the output
		 *  Samewise we can do for firefox and edge as well */
			
		ChromeOptions options = new ChromeOptions();  
		options.setAcceptInsecureCerts(true);
		
		Proxy proxy = new Proxy();  //This is used to set the proxy maybe it will be needed in some projects
		proxy.setHttpProxy("ipaddress:4444");
		options.setCapability("proxy", proxy);

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);
		
		/* For firefox and edge browsers
		FirefoxOptions options1 = new FirefoxOptions();  
		options.setAcceptInsecureCerts(true);
		
		EdgeOptions options2 = new EdgeOptions();
		options.setAcceptInsecureCerts(true); */

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
	}

}
