package com.company;

import java.util.Scanner;
public class Problem_A_1030 {
    //   In Search of an Easy Problem
    public static void main(String[] args) {
//        187 time
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), a = 0;
        while (n-->0){
             a+=sc.nextInt();
        }
        System.out.println(a>0?"HARD":"EASY");



//        171 time
//        ===================================
        sc.nextLine();
        System.out.println(sc.nextLine().contains("1")? "HARD": "EASY");
    }
}