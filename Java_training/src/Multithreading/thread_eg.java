package Multithreading;

public class thread_eg extends Thread{
	public void run()
	
	{
		System.out.println("Thread is running");
		for(int i=0;i<20;i++)
		{
			if (i%2==0)
			{
				System.out.println(i);
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread_eg t=new thread_eg();
		t.start();

	}

}
