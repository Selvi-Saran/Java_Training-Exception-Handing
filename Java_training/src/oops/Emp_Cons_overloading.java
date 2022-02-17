package oops;
class Employee
{
	int emp_id;
	String comp_name,city,dept;
	
	Employee()
	{
		System.out.println("Default Constructor");
		System.out.println("---------------------");
	}
	Employee(String comp_name,String city)
	{
		System.out.println("----------------------------");
		System.out.println("Parameterized Constructor");
		System.out.println("--------------------------");
		this.comp_name=comp_name;
		this.city=city;
	}
	Employee(int emp_id,String comp_name,String city,String dept)
	{
		System.out.println("----------------------------");
		System.out.println("Constructor Overloading");
		System.out.println("----------------------------");
		this.emp_id=emp_id;
		this.comp_name=comp_name;
		this.city=city;
		this.dept=dept;
	}
	void display()
	{
		
		System.out.println("Company Name     :  "+comp_name);
		System.out.println("Employee Id     :  "+emp_id);

		System.out.println("Department    :  "+dept);
		System.out.println("City      :  "+city);
	}
		
}


public class Emp_Cons_overloading {
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.display();

		Employee e2=new Employee("ABC","Singapore");
		e2.display();
		
		Employee e3=new Employee(100,"XYZ","Singapore","IT");
		e3.display();
		
		
	}
		
}

	


