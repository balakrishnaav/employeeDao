package day7;

public class TestWaitNotify {
	public static void main(String[] args) {
		Transactions tran = new Transactions();
		//Thread withdraw = new Thread(){public void run() {tran.withdraw(7000);}}; 
		//Thread deposit = new Thread(){public void run() {tran.deposit(5000);}};
		//withdraw.start();
		//deposit.start();
		//using lambda
	
		  Runnable r1 = ()->{ 
			  tran.withdraw(7000); 
		  }; 
		  Runnable r2 = ()->{
		      tran.deposit(5000); 
		  }; 
		  Thread withdraw = new Thread(r1); 
		  Thread deposit = new Thread(r2); 
		  withdraw.start(); 
		  deposit.start();
	}
}
