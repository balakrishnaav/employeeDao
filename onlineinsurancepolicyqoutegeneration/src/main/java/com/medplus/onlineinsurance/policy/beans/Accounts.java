package com.medplus.onlineinsurance.policy.beans;

public class Accounts {
	private int accountNumber;
	private String insuredName;
	private String insuredStreet;
	private String insuredCity;
	private String insuredState;
	private int insuredZip;
	private String businessSegment;
	private String agentName;
	private String userName;
	
	public Accounts() {
		
	}

	public Accounts(int accountNumber, String insuredName, String insuredStreet, String insuredCity,
			String insuredState, int insuredZip, String businessSegment, String agentName, String userName) {
		super();
		this.accountNumber = accountNumber;
		this.insuredName = insuredName;
		this.insuredStreet = insuredStreet;
		this.insuredCity = insuredCity;
		this.insuredState = insuredState;
		this.insuredZip = insuredZip;
		this.businessSegment = businessSegment;
		this.agentName = agentName;
		this.userName = userName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getInsuredName() {
		return insuredName;
	}

	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	public String getInsuredStreet() {
		return insuredStreet;
	}

	public void setInsuredStreet(String insuredStreet) {
		this.insuredStreet = insuredStreet;
	}

	public String getInsuredCity() {
		return insuredCity;
	}

	public void setInsuredCity(String insuredCity) {
		this.insuredCity = insuredCity;
	}

	public String getInsuredState() {
		return insuredState;
	}

	public void setInsuredState(String insuredState) {
		this.insuredState = insuredState;
	}

	public int getInsuredZip() {
		return insuredZip;
	}

	public void setInsuredZip(int insuredZip) {
		this.insuredZip = insuredZip;
	}

	public String getBusinessSegment() {
		return businessSegment;
	}

	public void setBusinessSegment(String businessSegment) {
		this.businessSegment = businessSegment;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Accounts [accountNumber=" + accountNumber + ", insuredName=" + insuredName + ", insuredStreet="
				+ insuredStreet + ", insuredCity=" + insuredCity + ", insuredState=" + insuredState + ", insuredZip="
				+ insuredZip + ", businessSegment=" + businessSegment + ", agentName=" + agentName + ", userName="
				+ userName + "]";
	}
	
	
	
}
