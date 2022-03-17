package com.company;

public class Problem_A_122 {
    //  Lucky Division
    public static void main(String[] args) {
       int n = new java.util.Scanner(System.in).nextInt();
        System.out.println(( n%4 == 0 | n%7 == 0 |n%47 == 0 | n%477 == 0) ?"YES" :"NO");
    }
}
