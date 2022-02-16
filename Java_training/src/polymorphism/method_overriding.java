package polymorphism;
class parent
{
	void show()
	{
		System.out.println("from parent class");
		
	}
	int add(int a,int b)
	{
		return a+b;
	}
}
class child extends parent 
{
	void show()
	{
		System.out.println("from child class");
		
	}
	int add(int a,int b)
	{
		return a*b;
	}
}

public class method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child c=new child();
		c.show();
		System.out.println(c.add(3,5));
		
		parent p=new parent();
		
		p.show();
		System.out.println(p.add(5, 4));
	}

}
