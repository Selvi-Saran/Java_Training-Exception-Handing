package Abstract_class;

class armstrong_no
{
	
	static int number = 153;
	
	static void calculate()
	{
		int InitialNumber, remainder, result = 0;
	 	InitialNumber = number;
	 	while (InitialNumber != 0)
	 	{
	 		remainder = InitialNumber % 10;
	 		result += Math.pow(remainder, 3);
	 		InitialNumber /= 10;
	 	}
	 	if(result == number)
	 		System.out.println(number + " is an Armstrong number."); 
	 	else
	 		System.out.println(number + " is not an Armstrong number.");
	 	
	}
	 	
}

public class Armstrong_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		armstrong_no.calculate();
		armstrong_no.number=252;
		armstrong_no.calculate();
		
	}

}
