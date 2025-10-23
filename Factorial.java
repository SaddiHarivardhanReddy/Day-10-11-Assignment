package com.codegnan.loopingstatements;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long fact=1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
		s.close();
	}

}
