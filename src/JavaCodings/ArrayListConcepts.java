package JavaCodings;

import java.util.ArrayList;

public class ArrayListConcepts {
	
	// can accept duplicate values
	//ArraList,LinkedList,vector- Implementing List interface 
	//array have fixed size where as arraylist can grow dynamicaly //you can access and insert any value in any index

	public static void main(String[] args) {

		ArrayList<String> obj = new ArrayList<String>(); //this is a dynamic datatype as we need not to be declare the size, we can add anytime
		obj.add("JAVA");
		obj.add("Selenium");
		System.out.println(obj);
		obj.add(0, "Automation");
		System.out.println(obj);
		//obj.remove("JAVA");
		//System.out.println(obj);
		System.out.println(obj.get(1));
		System.out.println(obj.contains("JAVA"));
		System.out.println(obj.indexOf("Automation"));
		System.out.println(obj.isEmpty()); 
		System.out.println(obj.size());
		
		
	}

}
