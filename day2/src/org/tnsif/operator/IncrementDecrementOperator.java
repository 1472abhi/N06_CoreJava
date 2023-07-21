package org.tnsif.operator;

import java.util.Scanner;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enetr your 1st number :- ");

		int n1=sc.nextInt();
		System.out.println("enetr your 2nd number :- ");

		int n2=sc.nextInt();
		
		int res1=n1++ + ++n2;
		
		System.out.println(res1);
		System.out.println(n1);
		System.out.println(n2);
		
		System.out.println("result 2");

		int res2=n1-- + --n2;
		System.out.println(res2);
		System.out.println(n1);
		System.out.println(n2);
		// TODO Auto-generated method stub

	}

}
