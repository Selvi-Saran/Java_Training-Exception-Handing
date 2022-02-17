
public class switch_Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int basic_salary,hra;
		basic_salary=2500;
		switch(basic_salary)
		{
		case 1500:
		
			hra=basic_salary*20/100;
			System.out.println("Basic Salary:"+basic_salary+ "HRA:" +hra);
			break;
				
		
		case 2500:
		
			hra=basic_salary*25/100;
			System.out.println("Basic Salary:"+basic_salary+ "HRA:" +hra);
			break;
		
		case 4500:
		
			hra=basic_salary*28/100;
			System.out.println("Basic Salary:"+basic_salary+ "HRA:" +hra);
			break;
		
		default:
		
			hra=basic_salary*10/100;
			System.out.println("Basic Salary:"+basic_salary+"HRA:"+hra);
			
		}
				
	}

}
