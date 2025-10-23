package com.codegnan.loopingstatements;

import java.util.Scanner;

public class CountofDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int c=0;
		int number=s.nextInt();
		while(number>0) {
			number=number/10;
			c++;
		}
		System.out.println(c);
		s.close();
	}

}
