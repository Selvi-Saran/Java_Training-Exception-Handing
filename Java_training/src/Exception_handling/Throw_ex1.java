package Exception_handling;
import java.util.*;
public class Throw_ex1
{
	static void arrayEx()
	{
		Scanner s=new Scanner(System.in);
	
		System.out.println("Enter the number of Employees");
		
		int no_of_emps=s.nextInt();
		if (no_of_emps >10)
			throw new ArrayIndexOutOfBoundsException("No of employess must be less than 10");
		else
		{
			int emp_id[]=new int[no_of_emps];
			String emp_name[]=new String[no_of_emps];
			String dept[]=new String[no_of_emps];
	
			System.out.println("Enter the employee details:");
	
		for(int i=0;i<no_of_emps;i++)
		{
			System.out.println("Employee ID:");
			emp_id[i]=s.nextInt();
		
			System.out.println("Employee Name:");
			emp_name[i]=s.next();
		
			System.out.println("Department:");
			dept[i]=s.next();
		}
		System.out.println("Employee ID:");
		for(int i:emp_id)
		{
			System.out.println(i);
		
		}
		System.out.println("Employee Name:");
		for(String i:emp_name)
		{
			System.out.println(i);
		
		}
	}
		

}

public static void main(String[] args) {
	arrayEx();
}
	

}
