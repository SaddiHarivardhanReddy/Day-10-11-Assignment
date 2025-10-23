package com.codegnan.controlstatements;

import java.util.Scanner;

public class NpalindromeNumber {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int upperLimit=s.nextInt();
			int currentNumber=1;//iterator from 1 to n
			int palindromeCount=0;//counter to store number of palindromes
			
			while(currentNumber<=upperLimit) {
				int originalNumber=currentNumber;//keep the original number
				int numberToReverse=originalNumber;//terparary variable for reversing
				int reversedNumber=0;//store reversed number
				
				while(numberToReverse>0) {
					int lastDigit = numberToReverse % 10;//trace last digit
					reversedNumber= reversedNumber *10 +lastDigit;//append digit
					numberToReverse = numberToReverse /10;//remove lastdigit
				}
				//check if original and reversed are same
				if(originalNumber == reversedNumber) {
					palindromeCount++;//increment the count if palindrome
				}
				currentNumber++;//move to the next number
			}
			System.out.println(palindromeCount);
			s.close();
			}
	}

