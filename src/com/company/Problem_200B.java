package com.company;

import java.util.Scanner;
public class Problem_200B {
    //    Drinks
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        for (int i = 0; i <n; i++) {
            cnt+=sc.nextInt();
        }
        System.out.println((double) cnt/n);
    }
}