package Java_Collections;

import java.util.ArrayList;

public class arr_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList();
		System.out.println("Initial list of elements:"+al);
		al.add("Selvi");
		al.add("Selva");
		al.add("Sadhana");
		System.out.println("After invoking add method:"+al);
		al.add(0,"Saran");
		System.out.println("After invoking add(index,element) method: "+al);
		al.remove("sadhana");
		System.out.println("After remove Sadhana:"+al);
		
		ArrayList<String> al2=new ArrayList();
		al2.add("Mahen");
		al2.add("sarathi");
		al.addAll(al2);  

		System.out.println("After invoking addAll(al2) method: "+al);  
		al.remove(al2);
		System.out.println("After removed al2 elements:"+al);
		ArrayList<String> al3=new ArrayList<String>();  
		al3.add("kalai");  
		al3.add("durai"); 
		//al3.addAll(al);
		al.addAll(al3);
		System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al);  
		
		

	}

}


