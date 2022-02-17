package Abstract_class;
import java.util.*;
class fib
{

	 static void Fibonacci(int N)
	  {
		 int num1 = 0, num2 = 1;
		  
	     int counter = 0;
	  
	        // Iterate till counter is N
	     while (counter < N) 
	     {
	   
	    	 System.out.print(num1 + " ");
	  
	    	 int num3 = num2 + num1;
	         num1 = num2;
	         num2 = num3;
	         counter = counter + 1;
	      }	
	  }
	           	      
}

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the munber:");
		int n=s.nextInt();
		fib.Fibonacci(n);
			
	}

}
