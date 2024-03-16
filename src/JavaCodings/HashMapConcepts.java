package JavaCodings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapConcepts {

	public static void main(String[] args) {	
		
		/*[interview Question]HashTable h = new HashTable(); instead of map we can use table, but in table another column will execute only after 1st is executed
		It has some minor changes as compared to hashmap otherwise both are same
		1)Synchronization and Thread Safe
		2)Null Keys and null values
		3)Iterating the value
		*/
		HashMap<Integer, String> h = new HashMap<Integer, String>(); //we should always give two values only
		h.put(1, "Hello");
		h.put(2, "Everyone");
		h.put(4, "Hiii");
		h.put(3, "Good Morning");
		System.out.println(h.get(4));
		System.out.println(h.remove(4));
		System.out.println(h);
		Set sn= h.entrySet(); //converting the map to set and stored in sn
		Iterator it =sn.iterator(); 
		//hashtable -pass table set collections  
		while(it.hasNext()) 
		{
			//System.out.println(it.next()); //if we run like hashset, it will throw an error
			Map.Entry mp=(Map.Entry)it.next(); //to get all the values, we gave the map entry
			System.out.println(mp.getKey()); 
			System.out.println(mp.getValue()); 
			}
		}


	}


