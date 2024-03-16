package JavaCodings;

public class ExceptionsConcept {

	public static void main(String[] args) {
		
		int  a=2;
		int b=0;
		
		try
		{
		int c = a/b; //2 will not divide by 0, so this is a error, if there is no error, output will come
		System.out.println(c);
		}
		
		catch(Exception e) //used to catch the error, if there is any error, it will show exception
		{
			System.out.println("I catched an error");
		}
		finally //even without catch block, finnaly will execute and print the finally output and it will throw error
		{
			System.out.println("This is finally");
		}
	}

}
