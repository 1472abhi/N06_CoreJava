package org.tnsif.decisionmaking;

import java.util.Scanner;

// program to demonstrate on bunjee jumping using nested if
public class NestedIfExecuter {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("age : ");

		int age=sc.nextInt();
		System.out.println("weight : ");
		int weight=sc.nextInt();
		if (age>=12) {
			if(weight>=40) {
			System.out.println("Eligible for bunjee jumping ");
			
				if(weight>110) {
					System.out.println("Extra ropes will be added ");

				}
			}
		}else {
			System.out.println("not eligible");

		}

	}

}
