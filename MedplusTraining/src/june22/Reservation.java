package june22;

import java.util.Scanner;

public class Reservation implements Runnable{
	protected int availableBerths=10;
	protected int required;
	
	Scanner sc=new Scanner(System.in);
	
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stubThread.currentThread().getN
		System.out.println("Welcome " +Thread.currentThread().getName());
		if(getAvailableBerths()==0)
		{
			System.out.println("Sorry "+Thread.currentThread().getName());
		}else {
			System.out.println("Enter Seats Required");
			required=sc.nextInt();
		
		if (required>getAvailableBerths()) {
			System.out.println("Not Enough Berths Available");
		}else if(required>0 && required<=getAvailableBerths()) {
			System.out.println("Alloted"+required+" berths to "+Thread.currentThread().getName());
			setAvailableBerths(getAvailableBerths()-required);
		}else {
			
		}
		}
		
		
	}

	public int getAvailableBerths() {
		return availableBerths;
	}

	public void setAvailableBerths(int availableBerths) {
		this.availableBerths = availableBerths;
	}

	public int getRequired() {
		return required;
	}

	public void setRequired(int required) {
		this.required = required;
	}
	

}
