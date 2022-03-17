package com.company;

import java.util.Scanner;

public class Problem_A_58 {
    // Chat room
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           String s = sc.next();
           System.out.println(s.matches(".*h.*e.*l.*l.*o.*") ? "YES" : "NO");
    }
}