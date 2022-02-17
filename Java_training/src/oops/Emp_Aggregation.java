package oops;


public class Emp_Aggregation {
	int id;  
	String name;  
	emp_address  address;  
	  
	public Emp_Aggregation(int id, String name,emp_address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
	  
	void display(){  
	System.out.println(id+" "+name);  
	System.out.println(address.city+" "+address.state+" "+address.country);  
	}  
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp_address add1=new emp_address("Tamilnadu","India","Kasai");  
		emp_address add2=new emp_address("Singapore","Bodok","North");  
		  
		Emp_Aggregation  e1=new Emp_Aggregation (100,"Selvi",add1);  
		Emp_Aggregation  e2=new Emp_Aggregation (101,"Saran",add2);  
		      
		e1.display();  
		e2.display();  

	}

}
