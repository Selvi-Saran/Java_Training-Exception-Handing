package Java_Collections;
import java.util.*;



public class Arraylist_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList emp=new ArrayList();
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
