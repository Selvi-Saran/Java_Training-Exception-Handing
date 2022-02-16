package Exception_handling;

public class Multiple_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String n1=null;
			int str_length=n1.length();
			System.out.println("Lenght of the name is:"+str_length);
			String name[]=new String[10];
			name[11]="selvi";
			
		}catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception occurs");

		}catch(ArrayIndexOutOfBoundsException   e)
		{
			System.out.println("Array Index Out Of Bounds");
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
