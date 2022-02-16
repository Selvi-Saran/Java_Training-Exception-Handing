package Exception_handling;

public class null_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String name=null;
			int str_length=name.length();
			System.out.println("Lenght of the name is:"+str_length);
		}catch(NullPointerException e)
		{
			System.out.println(e);
		}
		System.out.println("Therest of the code:");
		
		
		

	}

}
