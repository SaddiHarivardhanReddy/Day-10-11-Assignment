package com.codegnan.loopingstatements;
import java.util.Scanner;

public class SumOfPrimes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0; // variable to store sum of primes

        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) { // if prime
                sum += i; // add prime to sum
            }
        }
        System.out.println(sum);
        s.close();
    }
}
