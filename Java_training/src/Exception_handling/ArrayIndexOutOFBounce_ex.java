package Exception_handling;

public class ArrayIndexOutOFBounce_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String name[]=new String[10];
			name[11]="selvi";

		}catch(ArrayIndexOutOfBoundsException   e)
		{
			System.out.println("Exception is:"+e);
		}

	}

}
