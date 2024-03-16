package JavaCodings;

public class AbstractChildClass extends AbstractParentClass{ //extends is used because it was taking some methods from parent class

	public static void main(String[] args) {

		AbstractChildClass a = new AbstractChildClass();
		a.engine();
		a.Wheel();
		a.Wings();
		a.Colour();
		
		AbstractParentClass b = new AbstractChildClass(); //We can also use this like this is used in interface but we can't create the object for parent alone.But there is no need as it has access by the keyword extends
		b.Colour();
	}

	@Override
	public void Colour() {
		
		System.out.println("The Colour of the flight is Red");		
	}

}
