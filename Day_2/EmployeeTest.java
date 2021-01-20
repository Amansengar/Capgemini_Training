package com.cap.day2.pkg1;


public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.name = "Aman";
		emp.id =2;
		emp.salary = 25000;
		System.out.println(emp.name);
		System.out.println(emp.incrementSalary());
		System.out.println(emp.salary);
		
		Employee emp2 = new Employee(5,"Arish",25830);
		Employee emp3 = new Employee(8,"Akash",22100);
		System.out.println(emp2.name + " " + emp2.salary);
		System.out.println(emp3.name);
		System.out.println(emp3.toString()); // @ + somehexacode
		System.out.println(emp2.toString());
		System.out.println(emp);
	}

}
