package com.company;


import java.util.Scanner;
public class Problem_236A {
    // Boy or Girl
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.chars().distinct().count()%2==0?"CHAT WITH HER!":"IGNORE HIM!");
        //selection of distinct elements
    }
}