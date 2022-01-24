class Sample
{
	public static void main(String[] args)
	{
		System.out.println("Program Started");
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Addition is:: "+c);
		a = 25; //re-initialization
		b = 75; //re-initialization
		System.out.println("Addition is:: "+(a+b));
		a = 109; //re-initialization
		b = 118; //re-initialization
		System.out.println("a ka value:: "+a+" b ka value:: "+b+" Addition is:: "+(a+b));
		System.out.println("Program Ended");
	}
}