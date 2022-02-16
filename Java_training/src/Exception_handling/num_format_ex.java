package Exception_handling;

public class num_format_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="abc";  
		//int i=Integer.parseInt(s);
		
		int decimalex=Integer.parseInt( "20");
		int positiveno=Integer.parseInt( "+20");
		int negative=Integer.parseInt( "-20");
		
		System.out.println("Value is:"+decimalex);
		System.out.println("Value is:"+positiveno);
		System.out.println("Value is:"+negative);
	
		try {							//NumberFormatException
		
			String a="%@$";
			int a1=Integer.parseInt(a);
		}catch(NumberFormatException e)
		{
			System.out.println(e);
		}
	}

}
