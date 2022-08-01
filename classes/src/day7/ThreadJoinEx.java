package day7;

public class ThreadJoinEx {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyRunnable(), "T1");
		Thread t2 = new Thread(new MyRunnable(), "T2");
		Thread t3 = new Thread(new MyRunnable(), "T3");
		t1.start();
		t1.join(3000); 
		t2.start();
		t2.join();
		t3.start();
		
		t2.join();
		t3.join();
		System.out.println("All threads are dead exiting main()");
	}

}
