package JavaCodings;

public class FuctionOverloadingBasics {
	
	public void getData(int a) 
	{
		System.out.println(a);
	}
	
	public void getData(int a,int b) //Same method name but count if argument is different
	{
		System.out.println(a+b);
	}

	public void getData(String c) //Same method name but the return type of the argument is different
	{
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		FuctionOverloadingBasics a = new FuctionOverloadingBasics();
		a.getData(4);
		a.getData(4,6);
		a.getData("java");
	}

}
