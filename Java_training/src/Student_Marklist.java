import java.util.Scanner;

public class Student_Marklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int reg_no;
		String stu_name,dob,result,grade;
		float mark1,mark2,mark3,total_mark,average_mark;
		
		System.out.println("Enter Student Name:");
		stu_name=s.next();
		
		System.out.println("Enter Register No:");
		reg_no=s.nextInt();
		
		System.out.println("Enter DOB:");
		dob=s.next();
		
		System.out.println("Enter Mark 1:");
		mark1=s.nextFloat();
		
		System.out.println("Enter Mark 2:");
		mark2=s.nextFloat();
		
		System.out.println("Enter Mark3:");
		mark3=s.nextFloat();
		total_mark=mark1+mark2+mark3;
		average_mark=total_mark/3;
				
		if (mark1 >=50 && mark2 >= 50 && mark3>=50)
		{	
			result="Pass";
						
		}
		else 
		{
		
			result="Fail";
		}
		if (average_mark >=80)
		{
			
			grade="A";
		
		}
		else if (average_mark >=70 && average_mark < 80)
		{
			grade="B";
			
		}
		else
		{
			grade="C";
		}
		System.out.println("-------------------------------------------------");
		System.out.println("      		Student Marklist");
		System.out.println("-------------------------------------------------");
		System.out.println("Student Name:"+stu_name+ "\t" +"D.O.B:"+dob);
		System.out.println("Register No:"+reg_no);
		System.out.println("-------------------------------------------------");
		System.out.println("Mark 1:"+mark1);
		System.out.println("Mark 2:"+mark2);
		System.out.println("Mark3:"+mark3);
		System.out.println("-------------------------------------------------");
		System.out.println("Total Mark:"+total_mark+ "\t" +"Average Mark:"+average_mark);
		System.out.println("Result:"+result +    "\t"+"\t"+     "Grade:"+grade);
		System.out.println("--------------------------------------------------");
		

	}

}
