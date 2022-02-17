package Multithreading;

public class sys_memory {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 Runtime r=Runtime.getRuntime();  
		 //System.out.println("Total Memory: "+r.totalMemory());  
		 System.out.println("Befor Free Memory: "+r.freeMemory());  
		 long total1=r.totalMemory();
		 for(int i=0;i<10000;i++)
		 {  
			 new sys_memory();  
		 }  
		 System.out.println("During, Free Memory: "+r.freeMemory()); 
		 long total2=r.freeMemory();
		 r.gc();
		 long total3=r.freeMemory();
		 System.out.println(" After gc(), Free Memory: "+total3);
		 
		 System.out.println("change After gc(), Free Memory: "+(total2-total3));  

	}

}
