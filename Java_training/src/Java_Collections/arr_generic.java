package Java_Collections;
import java.util.*;

public class arr_generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList(); //Genric(Same datatype)
		
		list.add("101");

		list.add("Selvi");

		list.add("Collections");

		list.add("computer");
		for(String i:list)
		{
			System.out.println(i);
		}
		Collections.sort(list);
		System.out.println("After Sorting");
		for(String i:list)
		{
			System.out.println(i);
		}
		

	}

}
   