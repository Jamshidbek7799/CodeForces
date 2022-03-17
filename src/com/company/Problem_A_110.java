package com.company;

import java.util.Scanner;

public class Problem_A_110 {
    // Nearly Lucky Number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next().replaceAll("[1,2,3,5,6,8,9,0]","");

        int c=str.length();
        System.out.println(c==4||c==7?"YES":"NO");

    }
}