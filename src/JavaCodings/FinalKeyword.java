package JavaCodings;
//refer notebook for explanation

   // FINAL Keyword is a CONSTANT Keyword. We can't use or change in other classes or methods or variables

final class FinalKeyword { //if we give final in class, we can't extend this calls to child class

	final void getData() //if we use this final keyword for method, we can't overide this to child class, if we do, it will throw error
	{
		System.out.print("hello");
	}
	
	public static void main(String[] args) {

		final int a = 6; //if we use final, we can't change the value again
		// a=6; //if we give value like this for final variable, it will give error
		System.out.println(a);
		FinalKeyword fin = new FinalKeyword();
		fin.getData();
	}

}
