package Assessment;
import java.util.*;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n=s.nextInt();
		if (n%2==0)
		{
			if (n > 10)
				System.out.println("Not Weird");
			else
				System.out.println("Weird");

		}else
		{
			if (n < 10)
				System.out.println("Weird");
			else
				System.out.println("Not Weird");
		}
		

	}

}
