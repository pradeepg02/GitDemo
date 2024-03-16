package JavaCodings;

public class Methods {

	public static void main(String[] args) {
		
		Methods d = new Methods();
		{
			String name = d.getData();
			System.out.println(name);
		}
		
		Methods2 d2 = new Methods2();
		{
			String name = d2.getuserData();
			System.out.println(name);
		}
		
			String name = getData2(); //This is static reference, I didn't create the object and all
			System.out.println(name);

	}

// We should not give methods inside main class if we give it will throw an error
//Why method? - we can write all the line of code in one block and we have to give one name that is called method
	
	public String getData() //void is a return type, it returns nothing so we written as void,it returns string, we gave string
	{
		System.out.println("Hello Everyone");
		return "welcome";
	}
	
	public static String getData2() //if we give static, then we don't need to give the object, static will give the access to class level
	{
		System.out.println("Hello Everyone");
		return "welcome";
	}
}
