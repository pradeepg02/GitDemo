package SeleniumAutomationConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamsConcept {
	
	@Test
	public void RegularCode(){
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Arun");
		names.add("Adam");
		names.add("Robert");
		names.add("Justin");
		names.add("Andrew");
		
		int count = 0;
		for(int i=0; i<names.size(); i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("A"))
			{
				System.out.println(actual);
				count++;
			}
		}
		
		System.out.println(count);  //To get the number of words which starts with A
	}
	
	@Test
	public void StreamFilter()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Arun");
		names.add("Adam");
		names.add("Robert");
		names.add("Justin");
		names.add("Andrew");
		

		long a = names.stream().filter(s->s.startsWith("A")).count();  //We have to give .stream after the variable name, it is very important
		/*inside filter, we can give the intermediate opertaions that has two parameters
		 * s is the first parameter that is used to get the names from the arraylist
		 * then s.startswith is the second parameter that is a action folllowed by the lambda operator(->)that is used to validate that first parameter
		 * followed by there is terminal operation that is used to get the result
		 * Intermediate Operation doesn't have if there is terminal operations and terminal operation executes only when the inner intermediate operation turns true
		 */
		System.out.println(a);
		
		//Another way of defining the values in Streams instead of Arraylist
		long b = Stream.of("Arun","Adhi","John","Arjun","Daniel").filter(s->s.startsWith("A")).count();//if there are more option is second parameter, we can open curly braces and give
		//System.out.println(b);
		
		names.stream().filter(s->s.length()>4).limit(3).forEach(s->System.out.println(s)); //used to get the name whose length greater than 4 and limit is used to get upto 3 names
		
	}
	
	@Test
	public void Streammap() {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Aanand");
		names.add("Anuj");
		names.add("Vishwa");
		names.add("Tamil");
		names.add("Santhosh");
		
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Arun");
		names1.add("Adam");
		names1.add("Robert");
		names1.add("Justin");
		names1.add("Andrew");
		
		//Stream.of("Arun","Adhi","John","Arjun","Daniel").filter(s->s.endsWith("n")).map(s->s.toUpperCase()).forEach(s->System.out.println(s)); //To get the name ends with n and using map(map is used to modify) we are changing that to Uppercase
		//Stream.of("Ajeeth","Abhi","Aaanand","Sam","Daniel").filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		Stream newstream = Stream.concat(names1.stream(), names.stream()).sorted();  //used to concat two list to one, changing the list to streams and concating them
		//newstream.forEach(s->System.out.println(s));
		boolean flag = newstream.anyMatch(s->s.equals("Adam"));  //used to get that value is present in that stream or not, it'll return boolean values
		System.out.println(flag);
		
}
	
	@Test
	public void Streamcollect() {
		
		List<String> ls = Stream.of("Arun","Adhi","John","Arjun","Daniel").filter(s->s.endsWith("n")).map(s->s.toUpperCase()).collect(Collectors.toList()); //This is used to collect that value used instead of print statement
		System.out.println(ls.get(0));  //used to get the first value
		
		List<Integer> values = Arrays.asList(3,5,6,8,2,6,2,3,8,2);  //created a list of integers
		values.stream().distinct().forEach(s->System.out.println(s)); //used to get the unique values that's y the distinct keyword
		List<Integer> nt = values.stream().sorted().collect(Collectors.toList());  //used to sort the value and collect the values(used instead of print statement)
		System.out.println(nt.get(0));
		
	}
	

	public static void main(String[] args) {

		StreamsConcept obj = new StreamsConcept();
		obj.RegularCode();
		obj.StreamFilter();
		obj.Streammap();
		obj.Streamcollect();
	}

}
