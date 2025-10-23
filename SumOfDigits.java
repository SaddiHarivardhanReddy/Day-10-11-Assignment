package com.codegnan.loopingstatements;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int sum=0;
		while(number>0) {
			sum=sum+number%10;
			number=number/10;
		}
		System.out.println(sum);
		s.close();
	}

}
