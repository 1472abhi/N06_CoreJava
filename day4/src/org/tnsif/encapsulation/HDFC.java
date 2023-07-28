// program to demonstrate on Encapsulation
/* Encapsulation achives a data hiding  using private 
 * access specifier*/
package org.tnsif.encapsulation;

public class HDFC {
	//private data members
	
	private String accType;
	
	private long accountNo;
	private long atmCardno;
	private int pinNo;
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public long getAtmCardno() {
		return atmCardno;
	}
	public void setAtmCardno(long atmCardno) {
		this.atmCardno = atmCardno;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	@Override
	public String toString() {
		return "HDFC [accType=" + accType + ", accountNo=" + accountNo + ", atmCardno=" + atmCardno + ", pinNo=" + pinNo
				+ "]";
	}

}
