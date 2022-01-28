package com.company;


import java.util.Scanner;
public class Problem_50A {
    // Domino Piling
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        int cnt = (m*n)/2;
        System.out.println(cnt);
    }
}