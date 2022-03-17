package com.company;

import java.util.Scanner;
public class Problem_A_318 {
    //    Even Odds
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        System.out.println(2*k-1<=n ? 2*k-1 : 2*k-n-n%2);
    }
}