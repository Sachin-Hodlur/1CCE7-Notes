class Demo2
{
	int k = 11;
	double d = 11.12;
}

class TestDemo2
{
	int a = 10;
	double b = 20.20;
	
	public static void main(String[] args)
	{
		System.out.println("Program Satrted");
		System.out.println(new Demo2().k);
		System.out.println(new Demo2().d);
		System.out.println(new TestDemo2().a);
		System.out.println(new TestDemo2().b);
		System.out.println("Program Ended");
	}
}