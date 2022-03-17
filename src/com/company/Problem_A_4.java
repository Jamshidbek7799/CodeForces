package com.company;

import java.util.Scanner;

public class Problem_A_4 {
    // Watermelon
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n%2==0 && n!=2?"YES":"NO");
    }
}
