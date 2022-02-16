package oops;
class Address
{
	String city,state,country;
	Address(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
				
	}
}
class Emp
{
	int id;
	String name;
	Address address;
	Emp(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display()
	{
		System.out.println(id +" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
}

public class aggregate_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add1=new Address("asd","er","klk");
		Address add2=new Address("asd","er","klk");
		Address add3=new Address("asd","er","klk");
		
		Emp e1=new Emp(12,"selvi",add1);
		Emp e2=new Emp(13,"sara",add2);
		Emp e3=new Emp(14,"qwe",add3);
		e1.display();
		e2.display();
		e3.display();
		
		
	}

}
