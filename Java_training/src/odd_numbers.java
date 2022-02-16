import java.util.Scanner;
public class odd_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,nos;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		nos=s.nextInt();
		i=1;
		
		while (i<=nos)		
		{
			if (i % 2!=0)
			{
				System.out.println(i);
				
			}
			i++;
		}

	}

}
