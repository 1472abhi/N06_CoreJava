package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchExecutor {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("song menu :- \n 1. Waka waka \n 2. Taki Taki \n 3. Jai shree ram \n 3. sanam teri kasam  ");

		
		System.out.println("song Number : ");

		int songno=sc.nextInt();
		switch(songno) {
		case 1:
			System.out.println("Waka Waka");
			break;
		case 2:
			System.out.println("Taki Taki");
			break;
		case 3:
			System.out.println("Jai shree ram");
			break;
		case 4:
			System.out.println("sanam teri kasam");
			break;
		default:
			System.out.println("Invalid Input");

		}
		// TODO Auto-generated method stub

	}

}
