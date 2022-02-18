package Java_Collections;
import java.util.*;
class Book1 implements Comparable<Book1>{  
	int id;  
	String name,author,publisher;  
	int nos;  
	public Book1(int id, String name, String author, String publisher, int nos) {  
		this.id = id;  
		this.name = name;  
		this.author = author;  
		this.publisher = publisher;  
		this.nos = nos;  
	}  
	public int compareTo(Book1 b) {  
		if(id>b.id){  
			return 1;  
		}else if(id<b.id){  
			return -1;  
		}else{  
			return 0;  
		}
}

public class priorityqueue_book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Book1> p=new PriorityQueue<Book1>();   
	    //Creating Books    
	  	Book1 b1=new Book1(101,"Nenjil oru mul","M.V.Varattharasanar","BPB",8);  
	  	Book1 b2=new Book1(102,"Diary of the whimpy kid","Selvi","Anjugam pathipagam",4);  
	  	Book1 b3=new Book1(103,"Artificial Intelligence","Krish","neur",6);  
	    //Adding Books to Deque   
	    p.add(b1);    
	    p.add(b2);    
	    p.add(b3);
	    System.out.println("\n"+"After Added");
	    for(Book1 b:p){    
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.nos);    
	        } 
	    p.remove();
	   // p.poll();
	    System.out.println("\n"+"After remove");
	    for(Book1 b:p){    
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.nos);    
	        } 

	}

}
}