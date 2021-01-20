package com.cap.day2.pkg1;

public class Employee {
	
		// Fields 
		int id;
		String name;
		double salary;
		public static  String companyName = "CAPGEMINI";
		// Methods
		double incrementSalary()
		{
			salary += 5000;
			return salary;
		}
	/*	public Employee(int id , String name , double salary)
		{
			this.id =id;
			this.name =name;
			this.salary =salary;
		}
		public Employee()
		{
			//Default Constructor
		}
		
		*/
		public Employee(int id, String name, double salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		public Employee() {
			// super();
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
	// CLASS CONSISTS THE FOLLOWING ELEMENTS
	/*
	 * Fields : Values
	 * Methods : Behaviours of objects
	 * Constructors : special function to initiliaze the instance variables
	 * 
	 */
		
}
