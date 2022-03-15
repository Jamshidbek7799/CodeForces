package com.company;

import java.util.Scanner;
public class Problem_467A {
    //  George and Accommodation
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int cnt=0;
        while (n-->0){
            int p=sc.nextInt();
            int q=sc.nextInt();
            if (q-p>=2){
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}