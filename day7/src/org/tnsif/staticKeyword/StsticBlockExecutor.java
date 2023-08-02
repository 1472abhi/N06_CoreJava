package org.tnsif.staticKeyword;

public class StsticBlockExecutor {
	String str;
	static float salary;
	/* static block is used to initialize satatic variable
	 * and we cant initialize any non-static variable inside the static block*/
	static {
		salary=768689.89f;
		//str="BKC";
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
