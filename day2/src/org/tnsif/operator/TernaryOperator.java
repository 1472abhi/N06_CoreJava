package org.tnsif.operator;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enetr your any number :- ");

		int n1=sc.nextInt();
		String result=(n1%2==0)?"Even":"Odd";
		System.out.println("Result is : "+result);
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
