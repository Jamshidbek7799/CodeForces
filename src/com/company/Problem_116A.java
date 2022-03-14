package com.company;

import java.util.Scanner;
public class Problem_116A {
    //  Tram
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0,c=0;
        for(int i=0;i<n;i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            c=c-a+b;
            if(c>max)
                max=c;
        }
        System.out.println(max);

    }
}