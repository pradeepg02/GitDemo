package JavaCodings;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcepts {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("UK");
		hs.add("USA");
		hs.add("India");
		hs.add("UK"); //If we add duplicate values, hash set will automatically remove the duplicate value
		System.out.println(hs); //we can see that duplicate value of uk
		System.out.println(hs.contains("UK"));
		System.out.println(hs.isEmpty());
		
		Iterator<String> i = hs.iterator(); //usually it like loop only, everytime we give i.next, it will print every values one by one
		//System.out.println(i.next());
		//System.out.println(i.next());
		//System.out.println(i.next());
		
		while(i.hasNext()) //Another type to print all the values
		{
			System.out.println(i.next());
		}

	}

}
