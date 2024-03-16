package testngcodes;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basics3 {
	
	@Parameters({"URL"})   //parameters used to get the url from the XML file and  putting that in urlname and we printing that, This only applicable for this test, others we have specify 
	@Test
	public void CarLoanWeb(String urlname)
	{
		System.out.println("Car Web Loan");		
		System.out.println(urlname);
	}
	
	@Test   //(enabled=false)    //enabled=false is used to turn off the test case, So that It will not run
	public void CarLoanAPI()
	{
		System.out.println("Car API Loan");		
	}
	
	@Test(dataProvider="getData")
	public void Loan(String username, String password)
	{
		System.out.println("Loan check");	
		System.out.println(username);
		System.out.println(password);
	}
	
	
	@Test(groups= {"Smoke"})   //group is used to run sanity test or smoke test in any tess and classes, by giving the name and combine them by groups
	public void CarLoanMobile() 
	{
		System.out.println("Car Mobile Login");		
	}
	
	@Test(groups= {"Smoke"})   //group is used to run sanity test or smoke test in any tess and classes, by giving the name and combine them by groups
	public void HomeLoanAPI()
	{
		System.out.println("Home Loan API Login");
	}
	
	@BeforeSuite
	public void beforeall()
	{
		System.out.println("This is first thing to execute before all the tests in the test folders");
	}
	
	@Test  //(dependsOnMethods= {"CarLoanAPI"})   //depended on that method, so it will run that first and run this
	public void EVCarLoan()
	{
		System.out.println("EV Car Loan");
	}
	
	@DataProvider    //used to run multiple datasets in multiple combinations
	public Object[][] getData() {
		
		//1st Combination - Username & Password - Good Credit History
		//2nd Combination - Username & Password - No Credit History
		//3rd Combination - Username & Password - Fraudelent History  We have to create these combinations
		Object[][] data = new Object[3][2];  //So For the above combinations, We created Object with multidimensional array, Rows are the 3 combinations and Columns are 2 values(uname and password)
		data[0][0] = "usernamefirstset";  
		data[0][1] = "passwordfirstset";
		
		//2nd Set
		data[1][0] = "usernamesecondset";
		data[1][1] = "passwordsecondset";
		
		//3rd Set
		data[2][0] = "usernamethirdset";
		data[2][1] = "passwordthirdset";
		return data;  //used to return the above data, So changed Object in place of void
		
	}

}
