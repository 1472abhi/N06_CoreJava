//program to demonstrate on class and objects
package org.tnsif.ClassAndObject;
// Class declaration
public class Employee {
	// default data members
	int empId;
	String empName;
	float salary;
	String department;
	//Method declaration and definition
	
	void display()
	{
		System.out.println("Emp Id : "+empId+"\nEmp Name : "+empName+"\nsalary : "+salary+"\ndepartment : "+department);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.empId=123456;
		e.empName="Abhishek mahale";
		e.salary=78000;
		e.department="comp";
		e.display();

	}
}
