package polymorphism;
class stud
{
	private int stu_id;
	private String name,city;
	public void setStu_id(int stu_id)
	{
		this.stu_id=stu_id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public int getStu_id()
	{
		return this.stu_id;
		
	}
	public String getName()
	{
		return this.name;
		
	}
	public String getCity()
	{
		return this.city;
		
	}
	
}

public class student_bean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stud s=new stud();
		
		s.setStu_id(1000);
		s.setName("Selvi");
		s.setCity("cs");
		System.out.println("Student Id:"+s.getStu_id());
		System.out.println("Student  Name:"+s.getName());
		System.out.println("City:"+s.getCity());
		
		

	}

}
