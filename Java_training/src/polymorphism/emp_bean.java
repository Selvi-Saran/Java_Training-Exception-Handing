package polymorphism;
class Emp123
{
	private int emp_id;
	private String name,dept;
	public void setEmp_id(int emp_id)
	{
		this.emp_id=emp_id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	public int getEmp_id()
	{
		return this.emp_id;
		
	}
	public String getName()
	{
		return this.name;
		
	}
	public String getDept()
	{
		return this.dept;
		
	}
	
}

public class emp_bean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp123 e=new Emp123();
	
		e.setEmp_id(1000);
		e.setName("Selvi");
		e.setDept("cs");
		System.out.println("employee Id:"+e.getEmp_id());
		System.out.println("employee Name:"+e.getName());
		System.out.println("employee Dept:"+e.getDept());
		
		

	}

}

