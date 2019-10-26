package com.abc;

public class Account {
	
	private int acNo;
	private String acName;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Account(int acNo, String acName) {
		super();
		this.acNo = acNo;
		this.acName = acName;
	}
	
	public int getAcNo() {
		return acNo;
	}
	public void setAcNo(int acNo) {
		this.acNo = acNo;
	}
	public String getAcName() {
		return acName;
	}
	public void setAcName(String acName) {
		this.acName = acName;
	}
	
	@Override
	public String toString() {
		return "Account [acNo=" + acNo + ", acName=" + acName + "]";
	}

}