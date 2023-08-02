package org.tnsif.staticKeyword;

public class StaticMethodExecutor {
	String str="BKC";
	static float percentage=78.9f;
	
	static void displayScore(int score) {
		System.out.println(percentage);
		/* we cant use non-static variable inside static method*/
//		System.out.println(str);
		System.out.println("Score is "+score);

		
	}

	public static void main(String[] args) {
		displayScore(56);
		
		// TODO Auto-generated method stub

	}

}
