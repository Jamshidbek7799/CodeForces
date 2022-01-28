package com.company;


import java.util.Scanner;
public class Problem_546A {
    // Soldier and Bananas
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int k=sc.nextInt();
       int n=sc.nextInt();
       int w=sc.nextInt();
       int cnt=0;

       for (int i=1; i <=w ; i++)
           cnt += i * k;
        System.out.println(cnt<=n?0:cnt-n);

    }
}