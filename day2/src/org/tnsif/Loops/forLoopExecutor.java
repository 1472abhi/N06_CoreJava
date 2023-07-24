package org.tnsif.Loops;
import java.util.*;
public class forLoopExecutor {
	public static void HalfPyramid(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HalfPyramid(n);
		// TODO Auto-generated method stub

	}

}
