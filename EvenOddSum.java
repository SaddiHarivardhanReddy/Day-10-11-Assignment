package com.codegnan.loopingstatements;

import java.util.Scanner;

public class EvenOddSum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int evenSum = 0, oddSum = 0;
	        for (int i = 1; i <= n; i++) {
	            if (i % 2 == 0) {
	                evenSum += i;  
	            } else {
	                oddSum += i;  
	            }
	        }
	        System.out.println("Sum of even numbers: " + evenSum);
	        System.out.println("Sum of odd numbers: " + oddSum);
		s.close();
	}

}
