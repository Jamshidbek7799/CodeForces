package com.company;


import java.util.Scanner;

public class Problem_96A {
    // Football
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        System.out.println(s.contains("0000000") || s.contains("1111111")?"YES":"NO");


//      System.out.print(new java.util.Scanner(System.in).next().matches(".*(0{7,}|1{7,}).*") ? "YES" : "NO");
    }
}
