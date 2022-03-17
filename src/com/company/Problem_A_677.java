package com.company;

import java.util.Scanner;
public class Problem_A_677 {
    //   Vanya and Fence
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), h=sc.nextInt();
        int cnt=0;

        while (n-->0)
            if (sc.nextInt()<=h)
                cnt+=1;
            else
                cnt+=2;

        System.out.println(cnt);
        sc.close();
    }
}