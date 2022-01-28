package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Problem_339A {
    // Helpful Maths
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String[] sm = s.split("\\+");
        Arrays.sort(sm);
        System.out.println(String.join("+",sm));

    }
}