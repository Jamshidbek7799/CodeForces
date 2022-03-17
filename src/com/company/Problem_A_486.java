package com.company;

public class Problem_A_486 {
    //   Calculating Function
    public static void main(String[] args) {
        long n = new java.util.Scanner(System.in).nextLong();
        System.out.println(n % 2 == 0 ? n / 2 : (n / 2) - n);
    }
}