package org.tnsif.operator;

import java.util.Scanner;

public class AssignmentOperator {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enetr your first number :- ");

		int n1=sc.nextInt();
		System.out.println("enetr your second number :- ");
		
		int n2=sc.nextInt();
		n1-=n2;//n1=n1-n2
		System.out.println(n1);
		
		
	}

}
