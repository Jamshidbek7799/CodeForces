package com.company;


import java.util.Scanner;
public class Problem_112A {
    // Petya and Strings
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=sc.next().compareToIgnoreCase(sc.next());
        System.out.print(sum<0?-1:sum>0?1:0);


    }
}