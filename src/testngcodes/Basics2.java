package testngcodes;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basics2 {
	
	@AfterTest   //This @AfterTest is used to execute after all other test in the current test folder, We can write this in any test file in current test folder
	public void last()
	{
		System.out.println("This will be executed After all the tests");
	}

	@Parameters({"URL","API/username"}) //We can give many parameters just by putting comma in between
	@Test(groups= {"Smoke"})  //group is used to run sanity test or smoke test in any tess and classes, by giving the name and combine them by groups
	public void ploan(String perloan, String uname)
	{
		System.out.println("This is the Test Used for Personal Loan(XML File test)");		
		System.out.println(perloan);
		System.out.println(uname);
	}
	
}
