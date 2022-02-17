package oops;
import java.util.Scanner;


class emp_data1{
	int emp_id;
	String emp_name,dept;//instance variable
	float basic_sal;
	float hra,da,tax,pr,tot_ded;
	
	Scanner s=new Scanner(System.in);
	void getData()//method declaration
	{
		System.out.println("Enter employee name:");
		emp_name=s.next();
		
		System.out.println("Enter employee ID:");
		emp_id=s.nextInt();
		
		System.out.println("Enter employee Salary:");
		basic_sal=s.nextFloat();
	}
	void calculate()
	{
		if (basic_sal>2000 && basic_sal<3000)
		{
			hra=basic_sal*20/100;
			da=basic_sal*10/100;
			tax=basic_sal*7/100;
			pr=basic_sal*5/100;
			
		}
	
		
		else if (basic_sal >3000 && basic_sal<4000)
		{
			hra=basic_sal*25/100;
			da=basic_sal*10/100;
			tax=basic_sal*7/100;
			pr=basic_sal*5/100;
			
				
		}
		if (basic_sal >4000 && basic_sal<5000)
		{
			hra=basic_sal*28/100;
			da=basic_sal*10/100;
			tax=basic_sal*7/100;
			pr=basic_sal*5/100;
			
		}
			
		else 
		{
			hra=basic_sal*10/100;
			da=basic_sal*10/100;
			tax=basic_sal*7/100;
			pr=basic_sal*5/100;

		}
	}
	
}
class emp_salary extends emp_data1
{
	float tot_ded,tot_ear,gross;
	void total_salary()
	{
		tot_ear=basic_sal+hra+da;
		tot_ded=tax+pr;
		gross=tot_ear-tot_ded;
		System.out.println("Total Earnings:"+tot_ear+"\t"+"Total deductions:"+tot_ded);
		System.out.println("Gross salary: "+gross);
		
	}
}
class report1 extends emp_data1
{
	void report()
	{
		System.out.println("----------------------------------------------");
		System.out.println("	Pay Slip");
		System.out.println("----------------------------------------------");
		System.out.println("Employee Name:"+emp_name +  "\t"   +"Employee Id"+emp_id);
		System.out.println("----------------------------------------------");
		System.out.println("Basic_salary"+basic_sal+  "\t"  +  "Tax:"+tax);
		System.out.println("hra:"+hra+  "\t" +"\t"  +   "Pr:"+pr);
		System.out.println("DA"+da);
		System.out.println("--------------------------------------------");
		
	}
}



public class Emp_hierarInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp_salary s=new emp_salary();
		report1 r=new report1();
		r.getData();
		r.calculate();
		s.total_salary();
		r.report();
		
		

	}

}
