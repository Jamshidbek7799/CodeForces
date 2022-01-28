package com.company;

import java.util.Scanner;

public class Problem_59A {
    // Word
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int lowercase=0, uppercase=0;

        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)>=97) {   // 97 is ASCII table.
                lowercase++;
            }else uppercase++;
        }
        System.out.println(lowercase>=uppercase?s.toLowerCase():s.toUpperCase());

    }
}