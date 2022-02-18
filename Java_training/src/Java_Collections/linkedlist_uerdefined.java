package Java_Collections;
import java.util.*;
import java.util.LinkedList;
import java.util.List;

/*class Employee
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
*/
public class linkedlist_uerdefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(101,"Selvi","Computer");
		Employee e2=new Employee(102,"Selva","Science");
		Employee e3=new Employee(103,"Sadhana","Police");
		List<Employee> list=new LinkedList();  
		 list.add(e1);  
		 list.add(e2);  
		 list.add(e3);  
		 for(Employee e:list)
		 {  
			 System.out.println(e.empid+"\t"+e.name+"\t"+e.dept);  
		 }  
	}

}
