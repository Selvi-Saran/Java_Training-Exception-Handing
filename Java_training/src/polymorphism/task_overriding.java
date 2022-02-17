package polymorphism;
class parent1
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
class child1 extends parent1 
{
	void show()
	{
		System.out.println("from child class");
		
	}
	int add(int a,int b)
	{
		return a-b;
	}
}
public class task_overriding {

	public static void main(String[] args) {
		// TODO Auto-
		
		child1 c=new child1();
		
		c.show();
		System.out.println(c.add(3,5));
		
		parent1 p=new parent1();
		
		p.show();
		System.out.println(p.add(5, 4));
	}

}
