package com.company;


import java.util.Scanner;
public class Problem_158A {
    // Next Round
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int massiv[]=new int[n];

        int cnt=0;
        for (int i = 0; i <n ; i++) {
            massiv[i]=sc.nextInt();
            if (massiv[i]>0 && massiv[i]>=massiv[k-1]){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}