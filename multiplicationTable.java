package com.codegnan.controlstatements;

import java.util.Scanner;

public class multiplicationTable{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=s.nextInt();
		for(int i=1;i<=10;i++)
		{
			int result=n*i;
			System.out.println(n+" * "+i+" = "+result);
		}
		s.close();
	}

}
//1.table multiplication
//2.count the digits in a number
//3.sum of digits
//4.factorial number
//5.amstrong number
//6.reverese a number
//7.palindromic number
//8.fibinocci number
//9.sum of even and odd number upto n terms
//10.print sum of prime numbers