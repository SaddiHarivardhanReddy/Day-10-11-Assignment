package com.codegnan.controlstatements;

import java.util.Scanner;

public class SingleDigitReducer {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		while(num>=10) {//if number has more than one single digit
			int digitSum=0;//variable to store sum of digits
			while(num>0) {
				int lastDigit=num%10;//get last digit
				digitSum+=lastDigit;
				num=num/10;
			}
			num=digitSum;
		}
		System.out.println(num);
		s.close();
	}

}
