package Exception_handling;

public class Throw_ex {
	static void checkAge(int age)
	{
		if(age<18)
		throw new ArithmeticException("Access is denied:Age must be more tah 18:");	
		else 
			System.out.println("Success");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAge(10);

	}

}
