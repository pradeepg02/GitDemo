package JavaCodings;
//Refer notebook for clear explanation
public class ConstructorConcept {

	public ConstructorConcept() //This is a way to define constructor, shld be same as class name and should not have any return type
	{
		System.out.println("I am the Constuctor"); //This will create whenever the object is created, eventhough if we didn't define it.
		System.out.println("I am the Constuctor 2");
	}
	
	public ConstructorConcept(int a, int b)
	{
		System.out.println("I am the Paramaterized Constuctor");
	}
	
	public ConstructorConcept(String a)
	{
		System.out.println("I am the Paramaterized Constuctor");
		System.out.println(a);
	}
	public void getData()
	{
		System.out.println("I am the Method");
	}
	public static void main(String[] args) {
		
		ConstructorConcept a = new ConstructorConcept(); //eventhough I didn't call the constructor, it worked.
		ConstructorConcept b = new ConstructorConcept(3,7);
		ConstructorConcept c = new ConstructorConcept("Java"); //If we didn't define the correct arguments, it will not implicitly call the constructor, it will return error.
		
	}

}

//Constructor will be called implicitly only when no constructor is defined
