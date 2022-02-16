package oops;
import java.util.*;

public class Emp_constructor {
	
	int emp_id;
	String comp_name,city,dept,emp_name;
	Scanner s=new Scanner(System.in);
	
	
	Emp_constructor(String comp_name,String city,String dept)
	{
		this.comp_name=comp_name;
		this.city=city;
		this.dept=dept;
		
	}
	void getData()
	{
		System.out.println("Enter employee id:");
		emp_id=s.nextInt();

		System.out.println("Enter employee name:");
		emp_name=s.next();
	}
	void display()
	{
		
		System.out.println("Company Name:  "+comp_name);
		System.out.println("Employee Id:  "+emp_id);
		System.out.println("Employee Name:  "+emp_name);
		System.out.println("Department:  "+dept);
	
		System.out.println("City:  "+city);
		
		//System.out.println("Company Name:"+comp_name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner s=new Scanner(System.in);
		//int emp_id;
		//string 
		
		Emp_constructor c1=new Emp_constructor("ABC","Singapore","IT");
		c1.getData();
		c1.display();
		

	}

}
