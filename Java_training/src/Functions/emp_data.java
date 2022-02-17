package Functions;
import java.util.*;

public class emp_data {
	int emp_id,age;
	String emp_name,dept;//instance variable
	float basic_sal,hra,da,tax,pr,tot_ded,tot_ear,gross;
	
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
		tot_ear=basic_sal+hra+da;
		tot_ded=tax+pr;
		gross=tot_ear-tot_ded;
	}
	void report()
	{
		System.out.println("----------------------------------------------");
		System.out.println("	Pay Slip");
		System.out.println("----------------------------------------------");
		System.out.println("Employee Name:"+emp_name +       "Employee Id"+emp_id);
		System.out.println("----------------------------------------------");
		System.out.println("Basic_salary"+basic_sal+      "Tax:"+tax);
		System.out.println("hra:"+hra+             "Pr"+pr);
		System.out.println("DA"+da);
		System.out.println("--------------------------------------------");
		System.out.println("Total Earnings:"+tot_ear+"\t"+"Total deductions:"+tot_ded);
		System.out.println("Gross salary"+gross);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp_data obj=new emp_data();
		for(int i=0;i<3;i++)
		{
			obj.getData();
			obj.calculate();//method call
			obj.report();
		}

	}

}
