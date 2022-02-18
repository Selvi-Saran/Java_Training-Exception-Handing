package Java_Collections;
import java.util.*;
class Student
{
	int rollno;
	String name;
	int age;
	Student(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		
	}
}


public class arraylist_realtime_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(101,"Selvi",23);
		Student s2=new Student(102,"Selva",28);
		Student s3=new Student(103,"Sadhana",20);
		ArrayList<Student> a1=new ArrayList();
		a1.add(s1);a1.add(s2);a1.add(s3);
		Iterator i=a1.iterator();
		while(i.hasNext())
		{
			Student st=(Student)i.next();
			System.out.println(st.rollno+ " "+st.name+" "+st.age);
		}
		
		
	}

}
