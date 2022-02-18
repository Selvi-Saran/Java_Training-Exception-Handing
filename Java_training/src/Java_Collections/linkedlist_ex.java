package Java_Collections;
import java.util.*;

import java.util.ArrayList;
import java.util.Iterator;

public class linkedlist_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList emp=new LinkedList();
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
