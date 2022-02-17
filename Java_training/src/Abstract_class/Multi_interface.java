package Abstract_class;
interface printer
{
	void print();
	default void msg()
	{
		System.out.println("from interface printer");
	
	}
}
interface scanner
{
	void scan();
	static void msg()
	{
		System.out.println("FRom Scanner interface printer");
	}
}

public class Multi_interface implements printer,scanner
{
	@Override
	public void print()
	{
		System.out.println("Overriden of print method");
	}
	@override
	public void scan()
	{
		System.out.println("Overriden of scan method");
	}


	public static void main(String[] args) {
		
		Multi_interface m=new Multi_interface();
		
		//printer.
				

	}

}
