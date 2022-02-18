package Java_Collections;
import java.util.*;
import java.util.LinkedList;

public class linkedlist_method_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll =new LinkedList<String>();
        
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        ll.add("Anuj");
        ll.add("Selvi");
        ll.add("Harsh");
        ll.add("Saran");
        ll.add("Selvi");
        ll.add("Sadhana");
        ll.add("Amit");
        
        System.out.println("Initial Elements:"+ll);
        ll.set(0, "Arul");
        System.out.println("After using SET method:"+ll);
        Collections.sort(ll);
        System.out.println("After Sorting:"+ll);
        
        
	}

}
