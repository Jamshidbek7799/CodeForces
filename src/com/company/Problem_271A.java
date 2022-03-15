package com.company;

public class Problem_271A {
    //  Beautiful Year
    public static void main(String[] args) {
       int n = new java.util.Scanner(System.in).nextInt();
        while((Integer.toString(++n).chars().distinct().count())<4);
        System.out.println(n);
    }
}
