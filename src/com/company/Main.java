package com.company;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.next().replaceAll("A","").length();
        System.out.println(n-d>d?"Anton":n-d<d?"Danik":"Friendship");
    }
}
