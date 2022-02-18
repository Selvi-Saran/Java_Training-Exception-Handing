package Java_Collections;
import java.util.*;


public class Priority_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue emp=new PriorityQueue();
		PriorityQueue stu=new PriorityQueue();
		emp.add("India");
		emp.add("Selvi");
		emp.add("Computer Science");
		emp.add("Singapore");
		
		emp.add("Singapore");
		
		System.out.println("head:"+emp.element()); 
		System.out.println("head:"+emp.peek());  
		System.out.println("iterating the queue elements:"); 
		Iterator i=emp.iterator();  
		while(i.hasNext())
		{  
		System.out.println(i.next()); 
		}
		emp.remove();  
		emp.poll();  
		System.out.println("after removing two elements:"); 
		
		
		Iterator i1=emp.iterator();
		while(i1.hasNext())
		{  
		System.out.println(i1.next()); 
		}
		
		

	}

}
