package JavaCodings;
//Check in notebook to brief explanation and it also has function overriding code
public class InheritanceChildClass extends InheritanceParentClass {

	public void colour()
	{
		System.out.println("The Colour of the car is red");
	}
	
	public void AC()
	{
		System.out.println("The AC of the car should be minimal");
	}
	
	public void Tyres() //this method is also in parent class but i called here and I updated the output. this is called function overriding
	{
		
		System.out.println("The Tyres of the Child class is changed"); //Parent class will not come only this one will come
	}
	public static void main(String[] args) {

		InheritanceChildClass c = new InheritanceChildClass();
		c.colour();
		c.engine();
		c.Regulator();
		c.Tyres(); //It was overrided by the child class, so child output will come here if we run
		
	}

}
