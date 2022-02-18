package Java_Collections;
import java.util.*;

public class deque_bookapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Deque<Book> s=new ArrayDeque();    
		    //Creating Books    
		  	Book b1=new Book(101,"Nenjil oru mul","M.V.Varattharasanar","BPB",8);  
		    Book b2=new Book(102,"Diary of the whimpykid","Selvi","Anjugam pathipagam",4);  
		    Book b3=new Book(103,"Artificial Intelligence","Krish","neur",6);  
		    //Adding Books to Deque   
		    s.add(b1);    
		    s.add(b2);    
		    s.add(b3);
		    System.out.println("\n"+"After Added"+"\n");
		    for(Book b:s){    
		        System.out.println(b.id+" "+b.name+"\t "+b.author+" \t"+b.publisher+"\t "+b.nos);    
		        } 
		    s.remove();
		    s.poll();
		    System.out.println("\n"+"After remove");
		    for(Book b:s){    
		        System.out.println(b.id+"\t"+b.name+" \t"+b.author+"\t "+b.publisher+" \t"+b.nos);    
		        } 
		   
	}

}
