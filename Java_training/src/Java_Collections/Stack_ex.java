package Java_Collections;
import java.util.*;


public class Stack_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push(1000);
		s.push("Selvi");
		s.push("Computer Science");
		s.push(98);
		s.push("Pass");
		System.out.println(s);
		System.out.println(s.pop());
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
