package Java_Collections;
import java.util.*;

public class likedlist_methods {

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
        ll.remove("Vijay");
        System.out.println("Initial Elements:"+ll);
        ll.remove(0);
        System.out.println("Initial Elements:"+ll);
        LinkedList<String> l2 =new LinkedList<String>();
        l2.add("sonoo");
        l2.add("Hanumat");
        
        ll.addAll(l2);
        System.out.println("Updated List:"+ll);
        ll.removeAll(l2);
        System.out.println("After RemoveAll:"+ll);
        ll.removeFirst();
        System.out.println("After RemovingFirst:"+ll);
        
        ll.removeLast();
        System.out.println("After RemovingLast:"+ll);
        ll.removeFirstOccurrence("Gaurav");
        System.out.println("After removeFirstOccurance():"+ll);
        
        ll.removeLastOccurrence("Harsh");
        System.out.println("After removeLastOccurance():"+ll);
        
        ll.clear();
        System.out.println("After invoking clear():"+ll);
        

	}

}
