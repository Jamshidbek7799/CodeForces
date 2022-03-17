package com.company;

import java.util.Scanner;
public class Problem_A_41 {
    // Translation
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        String reverseString = new StringBuffer(s).reverse().toString();

        System.out.println(t.contentEquals(reverseString)?"YES":"NO");

    }
}
