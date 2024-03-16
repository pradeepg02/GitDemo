package JavaCodings;

public class Thiskeyword {
	
	int a = 3; //varaible outside method
	
	public void getData()
	{
		int a = 5; //same varaible inside the method accessible only in this method
		int b = a + this.a; //to add two variables outside and inside
		System.out.println(a);
		System.out.println(this.a); //used to print the same variable outside the method also
		System.out.println(b);
	}

	public static void main(String[] args) {

		Thiskeyword t = new Thiskeyword();
		t.getData(); //if we didn't use this keyword, only the variable inside method will get printed
	}
 
}
