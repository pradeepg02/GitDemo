package JavaCodings;

public class JavaLoops {

	public static void main(String[] args) {
		
		int i=2;
		
		//While Loop
		
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		
		//Do - While
		
		int j=10;
		do
		{
			System.out.println(j);
			j++;
		}
		while(j<=20);
		
		//Nested Loop
		
		for(i=1;i<=1;i++)
		{
			System.out.println("Outer Loop Started");
			for(j=1;j<=4;j++)
			{
				System.out.println("Inner loop Started");
			}
			System.out.println("Outer Loop finished");
		}
		
		/* We have to print the numbers in this fashion
		 1 2 3 4
		 5 6 7
		 8 9
		 10   We'll write a code for that
		 */
		int k=1; // This is for printing the values
		for(i=0;i<4;i++)
		{
			for(j=1;j<=4-i;j++)
			{
				System.out.print(k);
				System.out.print(" "); //We can also give \t for the larger gap between the numbers
				k++;
			}
			System.out.println(""); //Explanation in Notebook
		}
		
		/* 
		 This is used to print the output in this format
		 1
		 2 3
		 4 5 6
		 7 8 9 10
		 */
        int k1=1; // This is for printing the values
		for(i=1;i<5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(k1);
				System.out.print(" "); //We can also give \t for the larger gap between the numbers
				k1++;
			}
			System.out.println(""); 
		}
		/* 
		 This is for printing in this pattern
		 1 
         1 2 
         1 2 3 
         1 2 3 4 
		 */
		for(i=1;i<5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
				System.out.print(" "); //We can also give \t for the larger gap between the numbers
			}
			System.out.println(""); 
		}
		
		/* 
		 This is to print the multiples of 3 in this order
		 3
		 6 9
		 12 15 18
		 */
		int k2=1;
		for(i=1;i<4;i++)
		{
			for(j=1;j<=i;j++)
			{

				System.out.print(k2*3);
				System.out.print(" "); //We can also give \t for the larger gap between the numbers
				k2++;
			}
			System.out.println(""); 
		}
	}

}


