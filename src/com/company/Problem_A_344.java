package com.company;

import java.util.Scanner;
public class Problem_A_344 {
    //  Magnets
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), x, y=0, cnt=0;

        for (int i = 0; i <n ; i++) {
            x=sc.nextInt();
            if (x!=y) cnt++;
            y=x;
        }
        System.out.println(cnt);
        sc.close();
    }
}