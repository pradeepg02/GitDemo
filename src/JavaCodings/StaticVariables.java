package JavaCodings;

public class StaticVariables {
	
	String name;
	String address;
	static String city = "Bangalore"; // this is used because both names has same city. if the city is not same, we have to give city in the argument
	static int i=0;
	/*static
	{
		city = "bangalore";
		i = 0;
	}*/ //Used to declare all the static values instead of assigning one by one
	
	//if we make the variable static, all the objects will share the same variable
	
	StaticVariables(String name, String address) //constructor called to give the values to object
	{
		this.name = name; //this.name is used to assign the values to name variables outside constructor as this values only accessible within this constructor.
		this.address = address; //same for address variable
		i++;
		System.out.println(i); //printed 1 and 2 because we used static otherwise it will print only 1
	}

	public void getAddress()
	{
		System.out.println(address + "," + city);
	}
	
	public static void getCity() //This is a static method, we can call with class name itself 
	{
		System.out.println(city);
	}
	
	public static void main(String[] args) {

		StaticVariables obj = new StaticVariables("Ram", "Bellandur");
		StaticVariables obj2 = new StaticVariables("Sam", "Marthahalli");
		obj.getAddress();
		obj2.getAddress();
		StaticVariables.getCity(); //this is static method, i called with class name, no need for object
		
		//static method implies only for static variables not for all variables.
	}

}
