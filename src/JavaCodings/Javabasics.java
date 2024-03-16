package JavaCodings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Javabasics {

	public static void main(String[] args) {
		
	 //Variables and declaration
		int num=6;
		String name = "Pradeep";
		char letter ='G';
		double num1 = 6.77;
		boolean num2 = false;
		
		System.out.println(num +" is the normal number");
		System.out.println(name+" "+letter+" "+num1+" "+ num2);
		
		//Arrays - creating array of integers
		//One way of assigning values
		
		int[] arr = new int[5];	
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 6;
		arr[4] = 7;
		
		//Another way of creating array and assigning values
		
		int[] arr1 = {1,2,3,4,5};
		
		System.out.println(arr1[3]);
		
		//For loop for arr
		for(int i=0; i< arr.length; i++)
		{
		System.out.println(arr[i]);
		}
		
		//For loop for arr1
		
		for (int i=0; i< arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		
		//For loop for string
		String[] name1= {"java", "selenium", "automation"};
		for(int i=0; i<name1.length; i++) 
		{
			System.out.println(name1[i]);
		}
		
		//Enhanced For loop
		for(String s: name1)
		{
			System.out.println(s);
		}
		
		//Conditional Statments inside loop
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<arr2.length; i++)
		{
			if(arr2[i]%2 ==0)
			{
				System.out.println(arr2[i]);
			}
			else {
				System.out.println(arr2[i]+" is not an even number");		
				}
		}
		
		//Array List
		//Array list is different from array because we can add dynamic data in array list as it didn't have any fixed size while in array it have fixed size/number to add the elements and it's a static implementation and we can't edit once after it's given9we have to go to that array and we have to edit) So Array list is used morely
		ArrayList<String> a=new ArrayList<String>();
		a.add("Java1");
		a.add("Selenium2");
		a.add("Automation3");
		System.out.println(a.get(2));
		
		//For loop for the arraylist
		
		for(int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
	System.out.println("*************");
		//Enhanced For loop for Arraylist
		for (String str: a)
		{
			System.out.println(str);
		}
		
		//Contains keyword is used to check whether the value is in Arraylist(coming from a package util). this was not in normal array
		
		System.out.println(a.contains("Java1"));
		
		//We can change the normal array to arraylist
		
		String[] n = {"dhoni", "conway", "stokes"};
		List<String> changingarraytoarraylist = Arrays.asList(n); //We are giving list datatype/returntype because if we change the array to arraylist, we have to give list only. It was mentioned there also if we give a keyword aslist
		changingarraytoarraylist.contains("dhoni");
		
		//String is an object which has sequence of character (interview question)
		//It has 2 methods to create string, String literals and using new method
		
		//Method 1 String Literals
		String s1 = "Automation";
		String s2 = "Testing";
		
		//Method 2 new method
		
		String s3 = new String("hello");
		String s4 = new String("everyone");
		
		//Split string - to split the each letter
		
		String s = "Chennai Super Kings";
		String[] splittedstring = s.split("Chennai");
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
		System.out.println(splittedstring[1].trim()); //it deletes that space before super kings and displayed that's the use of trim
		
		//To print the string in the reverse order
		
		for(int i =s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i)); //printing the string in reverse order by character
		}

		
		}	

	}


