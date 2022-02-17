package Exception_handling;

public class Exception_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		
		int salary=25000;
		System.out.println("Salary is:"+salary);
		int hra=salary*15/0;
		System.out.println("Hra is"+hra);
		}catch(Exception e)
		{
			System.out.println(e);
			
		}
		System.out.println("Rest of thecode");
		
				

	}

}
