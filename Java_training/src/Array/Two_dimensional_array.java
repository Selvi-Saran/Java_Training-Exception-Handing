package Array;
import java.util.*;
public class Two_dimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int r,c;
		
		System.out.println("Enter the number of columns:");
		r=s.nextInt();
		
		
		System.out.println("Enter the number of columns:");
		c=s.nextInt();
		int table[][]=new int[r][c];
		
		System.out.println("Enter the data for the table");
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				table[i][j]=s.nextInt();
				
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(table[i][j]+" ");
				
				
			}
			
		System.out.println();	
		}

	}
}
