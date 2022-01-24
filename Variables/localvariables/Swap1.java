class Swap1
{
	public static void main(String[] args)
	{
		System.out.println("Program Started");
		int a = 10;
		int b = 20;
		int temp = 0;
		System.out.println("---------Before Swapping----------");
		System.out.println("a:: "+a);
		System.out.println("b:: "+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("---------After Swapping----------");
		System.out.println("a:: "+a);
		System.out.println("b:: "+b);
		System.out.println("Program Ended");
	}
}