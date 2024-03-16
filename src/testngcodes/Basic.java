package testngcodes;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic {

	@Test   //Used to run the testNG Test cases, First we have to insert @test and method(i used demo) and we can do anything inside that
	public void Demo()
	{
		System.out.println("hello");
		System.out.println("This is the Git from the another person");
		System.out.println("Hello from the 2nd Developer");
	}
	
	@AfterSuite
	public void afterall()
	{
		System.out.println("This is last thing to execute after all the tests in the test folders");
	}
	
	@Test(groups= {"Smoke"})   //We can write any number of test using @test  //group is used to run sanity test or smoke test in any tess and classes, by giving the name and combine them by groups
	public void SecondTest()
	{
		System.out.println("It's a Second Test NG Test");
	}
	
	@BeforeTest   //This @BeforeTest is used to execute before all other test, We can write this in any test file
	public void Prerequisite()
	{
		System.out.println("This is used as Prerequisite to Print first");  
	}

}
