package june22;

public class Numbers implements Runnable {
	
	@Override
	public synchronized void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i=1;i<5;i++)
			System.out.print(i+" ");
	}

}
