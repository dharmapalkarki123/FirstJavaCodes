package Threads; 
class ThreadSum extends Thread
{
	int sum;
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			sum=sum+i;
			synchronized(this)
			{
				notify();
				
			}
		}
		
	}
}

public class InterThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadSum tr = new ThreadSum();
		tr.start();
		synchronized(tr)
		{
			
			tr.wait();
		}
		
		System.out.println("Sum is ="+tr.sum);
	

	}

}
