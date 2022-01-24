class House
{
	static String archName = "Dinga";
	int rooms = 8;
	int door = 8;
	int window = 8;
}

class TestHouse
{
	public static void main(String[] args)
	{
		System.out.println("Program Started");
		System.out.println("Architect Name:: "+House.archName);
		House h1 = new House();
		System.out.println("Room:: "+h1.rooms);
		System.out.println("Door:: "+h1.door);
		System.out.println("window:: "+h1.window);
		House h2 = new House();
		House h3 = new House();
		House h4 = new House();
		House h5 = new House();
		System.out.println("Program Ended");
	}
}