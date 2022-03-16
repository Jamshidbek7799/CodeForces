package com.company;

import java.util.Scanner;
public class Problem_61A {
    //    Ultra-Fast Mathematician
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        for (int i = 0; i <a.length(); i++) {
            System.out.print(a.charAt(i)^b.charAt(i));
        }
    }
}