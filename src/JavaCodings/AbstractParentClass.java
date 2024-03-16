package JavaCodings;

public abstract class AbstractParentClass { //If we give abstract in any one method also, we have to give abstract in class

	public void engine()
	{
		System.out.println("Follow this engine rules");
	}
	
	public void Wings()
	{
		System.out.println("Follow this Wing rules");
	}
	
	public void Wheel()
	{
		System.out.println("Follow this Wheel rules");
	}
	
	public abstract void Colour(); //This is abstract class because there is no body so we have given abstract class
}
