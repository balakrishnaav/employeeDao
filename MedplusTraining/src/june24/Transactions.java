package june24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Transactions {
	private ArrayList<Account> accList=new ArrayList();
	Scanner sc=new Scanner(System.in);
	List<Account>accountList=new ArrayList<Account>();
	
	public Transactions() {
		accountList.add(new Account("aaa",100,6000));
		accountList.add(new Account("bbb",101,7000));	
	}
	public void createAccount(String name,double amount) {
		Account act =new Account(name,201,amount);
		accountList.add(act);
	}
	
	public void deposit(int acno,double amount) throws AccountNotFoundException{
		boolean found=false;
		for (Account acn :accountList) {
			if(acn.getAccountNumber()==acno) {
				found=true;
				
			}
		}
		try {
			if(!found)
				throw new AccountNotFoundException();
		}catch(AccountNotFoundException e) {
			System.out.println("Account Not Found");
		}
	}
	
}
