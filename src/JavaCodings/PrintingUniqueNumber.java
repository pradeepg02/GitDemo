package JavaCodings;

import java.util.ArrayList;

public class PrintingUniqueNumber {

	public static void main(String[] args) {
		
		int a[] = {4,5,5,5,4,6,6,9,4}; 
		//Print unique number from the list - Amazon interview Question
		//we have to find how many times each number is repating and a unique number
		
		ArrayList<Integer>ab =new ArrayList<Integer>(); //for that we have created the array list first
		for(int i=0;i<a.length;i++) 
		{ 
			int k=0; //k is used to know how many times the value is repeated
			if(!ab.contains(a[i])) //negation(!) is used to send the values inside the loop that are not came before
			{
				ab.add(a[i]); //if the value doesn't came before, it will be added
				k++;
				for(int j=i+1;j<a.length;j++) 
				{
					if(a[i]==a[j]) //if previous value matches current value, then it will counted in k
					{
						k++;
					}
					}
				System.out.println(a[i]+" The number of times it's repeating is " +k);
				if(k==1) System.out.println(a[i]+" is unique number"); } } 
			}
		
	}


