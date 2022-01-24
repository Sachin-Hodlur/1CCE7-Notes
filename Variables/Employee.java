class Employee
{
	public static void main(String[] args)
	{
		System.out.println("Program Started");
		
		//Declare variable
		String empName;
		int empId;
		char gender;
		boolean isWorking;
		long mobNo;
		
		//Initialization
		empName = "Dinga";
		empId = 420;
		gender = 'M';
		isWorking = true;
		mobNo = 7777788888l;
		
		//Accsessing
		System.out.println("Employee Name:: "+empName);
		System.out.println("Employee Id:: "+empId);
		System.out.println("Employee gender:: "+gender);
		System.out.println("Employee Working Status:: "+isWorking);
		System.out.println("Employee Mob No:: "+mobNo);
		
		System.out.println("Program Ended");
	}
}