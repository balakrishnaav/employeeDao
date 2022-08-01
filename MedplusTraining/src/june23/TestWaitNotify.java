package june23;

public class TestWaitNotify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transactions tran=new Transactions();		
		Runnable r1=()->{
			tran.withdraw(7000);
		};
		
		Runnable r2=()->{
			tran.deposit(7000);
		};
		Thread withdraw=new Thread(r1);
		Thread deposit=new Thread(r2);
		withdraw.start();
		deposit.start();
	}

}
