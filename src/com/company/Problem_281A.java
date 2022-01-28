package com.company;



import java.util.Scanner;
public class Problem_281A {
    // Word Capitalization
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        System.out.println(Character.toUpperCase(s.charAt(0))+s.substring(1));

    }
}