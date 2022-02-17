package Java_Collections;
import java.util.*;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector emp=new Vector();
		emp.add(1000);
		emp.add("Selvi");
		emp.add(3500);
		emp.add("Singapore");
		
		emp.add("Singapore");

		System.out.println(emp);
		System.out.println(emp.get(3));
		Iterator i=emp.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
