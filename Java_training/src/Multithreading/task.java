package Multithreading;
import java.util.*;
class task1 extends Thread{
	public void run()
	{
		Scanner s=new Scanner(System.in);


		System.out.println("Please enter the value:");
		int n=s.nextInt();
		
		for(int i=0;i<n;i++)
		{
			if (i%2==0)
			{
				System.out.println("Thread 1:"+i);
			}
		}
	}
}
class task2 extends Thread
{
	public void run()
	{
		
		Scanner s=new Scanner(System.in);


		System.out.println("Please enter the value:");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Thread 2:"+i*i*i);
		}
		
	}
}
public class task{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		task1 t=new task1();
		task2 t1=new task2();
		t.start();t1.start();

	}

}
