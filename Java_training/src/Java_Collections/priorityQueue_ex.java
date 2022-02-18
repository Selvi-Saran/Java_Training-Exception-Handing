package Java_Collections;
import java.util.*;

public class priorityQueue_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> q=new PriorityQueue<String>();  
		q.add("Amit");  
		q.add("Vijay");  
		q.add("Karan");  
		q.add("Jai");  
		q.add("Rahul");  
		System.out.println("head:"+q.element());  
		System.out.println("head:"+q.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator i=q.iterator();  
		while(i.hasNext()){  
		System.out.println(i.next());  
		}  
		q.remove();  
		q.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> i1=q.iterator();  
		while(i1.hasNext()){  
		System.out.println(i1.next());  
		}

	}

}
