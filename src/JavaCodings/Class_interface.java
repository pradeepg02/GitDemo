package JavaCodings;
//Refer notebook for the interface and class differences and other interface topics
public class Class_interface implements InterfaceTrafficex,InterfaceExample2 { //InterfaceExample2 is a second interface created, we can add two interfaces also

	public static void main(String[] args) {
		
		InterfaceTrafficex a = new Class_interface(); //We have give Interface name first and the obj name and new keywords after that class name, Then only it will fetch the methods from Interface, if we give class name only, it will fetch only the methods in class.
		a.green();
		a.yellow();
		a.red();
		a.orange();
		System.out.print("\n");
		
		InterfaceExample2 b = new Class_interface(); //This is the object for second interface. called as same as first interface
		b.wrongroute();
		b.oneway();
		

	}

	@Override
	public void green() {
		
		System.out.println("Green says Go on");		
	}

	@Override
	public void yellow() {
		
		System.out.println("Yellow says Get ready to go");	
	}

	@Override
	public void red() {
		
		System.out.println("Red says Stop");		
	}

	@Override
	public void oneway() {

		System.out.println("We should come in one way");		
	}

	@Override
	public void wrongroute() {
	
		System.out.println("Coming in wrong route can cause accidents");	
	}

	@Override
	public void orange() {
		System.out.println("Be Cautious and go slowly");	
		
	}

}
