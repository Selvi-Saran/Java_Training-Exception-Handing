import java.util.Scanner;
public class switch_Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int course_code;
		
		System.out.println("Enter the course code:");
		course_code=s.nextInt();
		
		switch(course_code)
		{
		case 101:
			
			System.out.println("Depat is:" +"\t"+"CSE");
			break;
	
		case 102:
	
			System.out.println("Depat is:" +"\t"+"EEE");
		
			break;
		
		case 103:
		
			System.out.println("Depat is:" +"\t"+"MECH");
			break;
		
		case 104:
			
			System.out.println("Depat is:" +"\t"+"CIVIL");
			break;
		default:
			System.out.println("Invalid Course Code");
		}	

	}

}
