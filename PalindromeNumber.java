package com.codegnan.loopingstatements;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int reverse=0;
		int originalnum=num;
		while(num>0) {
			reverse=reverse*10+num%10;
			num/=10;
		}
		if(originalnum==reverse) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		s.close();
	}

}
