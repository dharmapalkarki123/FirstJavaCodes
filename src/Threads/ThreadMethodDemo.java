package Threads;

class MyThread extends Thread 
{
	public void run() {
		// System.out.println("I am a thread ");
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("MyThread");
		System.out.println(t);
		System.out.println(t.getName());
		t.setPriority(8);
		System.out.println(t);
		System.out.println(t.getPriority());
		
	}
}

public class ThreadMethodDemo {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		
	}

}
