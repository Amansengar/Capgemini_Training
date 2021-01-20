package com.cap.day2.pkg2;

import java.util.Date;
import static java.lang.Math.*;

import com.cap.day2.pkg1.Employee;

public class EmployeeTest {
	public static void main(String[] args) {

	Employee emp = new Employee();
	System.out.println(Employee.companyName);
	Date today = new Date();
	System.out.println(today);
	//calling static methods
	System.out.println(ceil(4.6));
	System.out.println(floor(3.6));
	
}
}