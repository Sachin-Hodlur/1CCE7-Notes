class Sample1
{
	int k = 11;
	double d = 11.12;
}

class TestSample1
{
	public static void main(String[] args)
	{
		System.out.println("Program Started");
		System.out.println("k ka value:: "+new Sample1().k);
		System.out.println("d ka value:: "+new Sample1().d);
		System.out.println("Program Ended");
	}
}