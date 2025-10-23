package com.codegnan.loopingstatements;

import java.util.Scanner;

public class ReverseNumber {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int num=s.nextInt();
			int reverse=0;
			while(num>0) {
				reverse=reverse*10+num%10;
				num/=10;
			}
			System.out.println(reverse);
			s.close();
		}

	}