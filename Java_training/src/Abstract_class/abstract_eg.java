package Abstract_class;
abstract class bank
{
	abstract int roi();//abstract method
	bank()
	{
		System.out.println("Abtraction demo");
	}
	void show()
	{
		System.out.println("Concrete method from abstract class");
		
	}
	
	
}
class HDFC extends bank
{
	int roi()
	{
		return 12;
	}
}

class ICICI extends bank
{
	int roi()
	{
		return 14;
	}
}
class UOB extends bank
{
	int roi()
	{
		return 10;
	}
}


public class abstract_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC h=new HDFC();
		ICICI i=new ICICI();
		UOB u=new UOB();
		System.out.println("HDFC interest rate is:"+h.roi());
		System.out.println("ICICI interest rate is:"+i.roi());
		System.out.println("UOB interest rate is:"+u.roi());
		
	}

}
