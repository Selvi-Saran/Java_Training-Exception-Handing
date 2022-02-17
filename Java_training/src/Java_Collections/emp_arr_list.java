package Java_Collections;
import java.util.*;
class Employee
{
	int empid;
	String name;
	String dept;
	Employee(int empid,String name,String dept)
	{
		this.empid=empid;
		this.name=name;
		this.dept=dept;
		
	}
}

public class emp_arr_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(101,"Selvi","Computer");
		Employee e2=new Employee(102,"Selva","Science");
		Employee e3=new Employee(103,"Sadhana","Police");
		ArrayList<Employee> a1=new ArrayList();
		a1.add(e1);a1.add(e2);a1.add(e3);
		Iterator i=a1.iterator();
		while(i.hasNext())
		{
			Employee emp=(Employee)i.next();
			System.out.println(emp.empid+ " "+emp.name+" "+emp.dept);
		}
		
	}

}
