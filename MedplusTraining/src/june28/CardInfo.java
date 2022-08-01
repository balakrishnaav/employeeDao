package june28;

import java.io.Serializable;

public class CardInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long cardno;
	private int month;
	private int year;
	private int cvv;
	private String name;
	
	public CardInfo() {
		
	}
	
	public CardInfo(long cardno, int month, int year, int cvv, String name) {
		super();
		this.cardno = cardno;
		this.month = month;
		this.year = year;
		this.cvv = cvv;
		this.name = name;
	}
	public long getCardno() {
		return cardno;
	}
	public void setCardno(long cardno) {
		this.cardno = cardno;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
