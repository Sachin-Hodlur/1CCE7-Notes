class Demo1
{
	public static void main(String[] args)
	{
		System.out.println("Program Started");
		final double pi = 3.142;
		/*pi = 4.125; Error We can't re-initialize the final variable */
		System.out.println(pi);
		System.out.println("Program Ended");
	}
}