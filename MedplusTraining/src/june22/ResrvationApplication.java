package june22;

public class ResrvationApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reservation	reservation=new Reservation();
		Thread t1=new Thread(reservation);
		Thread t2=new Thread(reservation);
		Thread t3=new Thread(reservation);
		t1.setName("Bala");
		t2.setName("krishna");
		t3.setName("sai");
		t1.start();
		t2.start();
		t3.start();
	}

}
