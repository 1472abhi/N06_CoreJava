package org.tnsif.encapsulation;
 
public class EncapsulationExecutor {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		//setting a value to private data members
		h.setAccType("Saving Account");
		h.setAccountNo(98765432345L);
		h.setAtmCardno(87654234567L);
		h.setPinNo(3443);
		
//System.out.println("Account number is : "+h.getAccountNo());
		
		//below line will call to toString() method
//		System.out.println(h);

	}

}
