class Demo2
{
	static int a = 10;
	static int b = 20;
}

class Demo3
{
	static int x = 25;
	static int y = 125;
	
	public static void main(String[] args)
	{
		System.out.println("Program Started");
		System.out.println("x ka value:: "+x);
		System.out.println("y ka value:: "+y);
		System.out.println("a ka value:: "+Demo2.a);
		System.out.println("b ka value:: "+Demo2.b);
		System.out.println("Program Ended");
	}
}