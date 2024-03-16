package JavaCodings;

public class ArrayBasicstoadvanced {

	public static void main(String[] args) {

		int a[] = new int[6]; //one way of creating array(new method is used to allocate values)
		
		a[0] = 6;
		a[1] = 7;
		a[2] = 8;
		a[3] = 9;
		a[4] = 2;
		a[5] = 4;
		
		int b[] = {1,2,3,4,5,6}; //Second way, it is called String literals
		
		for(int i = 0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i = 0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		
		//Multi dimentional Array
		
		int md[][] = new int[3][3];
		
		md[0][0] = 11;
		md[0][1] = 21;
		md[0][2] = 31;
		md[1][0] = 41;
		md[1][1] = 51;
		md[1][2] = 61;
		md[2][0] = 71;
		md[2][1] = 81;
		md[2][2] = 10;
		
		//System.out.print(md[0][0]);
	
		for(int i = 0; i<3; i++)
		{
			for(int j=0; j<3; j++) 
			{
				System.out.print(md[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
			
		}
		
		/*Printing the smallest number from all the values in the column
		
		1 5 7
		4 8 9
		2 5 8 */
		
		int csk[][] = {{3,1,7},{4,8,9},{2,5,8}};
		int min = csk[0][0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(csk[i][j]<min)
				{
					min = csk[i][j];
				}
				
            }
		}
		System.out.println(min);
		
       /*Printing the Largest number from all the values in the column
		
		1 5 7
		4 8 9
		2 5 8 */
		
		int csk1[][] = {{6,5,7},{4,3,9},{2,1,8}};
		int max = csk1[0][0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(csk1[i][j] > max)
				{
					max = csk[i][j];
				}
				
            }
		}
		System.out.println(max);
		
		/*
		 This program is to find the largest number in column which has minimum number
		 1)to find a min number
		 2)Obtain that column values
		 3) find the largest number in that column
		 */
		int abc[][] = {{6,5,0},{4,3,9},{2,1,8}};
		int min1=abc[0][0];
		int mincoloumn = 0;


		for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++)
		{
		if(abc[i][j]<min1)//2
		{
		min1=abc[i][j];
		mincoloumn=j;
		}
		}
		}
		int max1=abc[0][mincoloumn];
		int k = 0;
		while(k<3)
		{
		if(abc[k][mincoloumn]>max1)
		{
		max1=abc[k][mincoloumn];
		}
		k++;
		}
		System.out.println("\n");
		System.out.println(max1);
		
	}

}
