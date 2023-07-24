package org.tnsif.decisionmaking;

import java.util.Scanner;

public class CascadedIfElseExecutor {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("age1 : ");

		int age1=sc.nextInt();
		System.out.println("age2 : ");
		int age2=sc.nextInt();
		System.out.println("age3 : ");
		int age3=sc.nextInt();

//		System.out.println("weight : ");
//		int weight=sc.nextInt();
		if(age1>age2 && age1>age3) {
			System.out.println("age1 is grater : "+age1);

		}if(age2>age1 && age2>age3) {
			System.out.println("age2 is grater : "+age2);

		}else {
			System.out.println("age3 is grater : "+age3);

		}
		// TODO Auto-generated method stub

	}

}
