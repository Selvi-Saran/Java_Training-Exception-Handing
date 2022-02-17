package Abstract_class;

public class final_ex {
	final String NRIC="SDF3245325";
	
	final void add()
	{
		final int a=10,b=20;
		System.out.println("addition of 2 numbers");
	}
	void show()
	{
		System.out.println("Final class & methods are not inherited");
		System.out.println("Final variable are fixed not to be changed");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final_ex f=new final_ex();
		f.add();
		f.show();

	}

}
