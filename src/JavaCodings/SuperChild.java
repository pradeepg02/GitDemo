package JavaCodings;

public class SuperChild extends SuperParent {
	
	public SuperChild()
	{
		super(); //super class for the constructor //This super should be in top only
		System.out.println("I am the Child Constructor");
	}
	
	public void getStringData()
	{
		String name = "Selenium";
		System.out.println(name);
		System.out.println(super.name); //Super keyword is used to print the string that was in parent class too.
		
	}

	public void getData()
	{
		super.getData(); //super keyword is used for the method to get the parent class method
		System.out.println("I am the method from the child class"); //Samelike varaible we used for method
	}
	
	
	public static void main(String[] args) {

		SuperChild c = new SuperChild();
		c.getStringData(); //If there is no super class,it will print only local variable even though we use extends keyword. that's y super is used.
		c.getData();
		//If there is no local variable, both will print parent data only.
	}

}
