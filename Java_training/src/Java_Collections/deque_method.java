package Java_Collections;
import java.util.*;

public class deque_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> emp_id = new ArrayDeque();
		 emp_id.add(101);
	      emp_id.add(102);
	        emp_id.offer(103);
	        emp_id.offer(104);
	        emp_id.offerFirst(10001);
	    for(int i:emp_id)
        {
            System.out.println(i);
        }
		emp_id.poll();
        System.out.println("after remove");

        for(int i:emp_id)
        {
            System.out.println(i);
        }
        emp_id.pollLast();
        System.out.println("after remove");

		
	}

}
