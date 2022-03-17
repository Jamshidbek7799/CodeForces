package com.company;

import java.util.Scanner;
public class Problem_A_136 {
    //  Presents
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n+1];
        int p[]=new int[n+1];
        for(int i=1;i<=n;i++) {
            a[i]=sc.nextInt();
            p[a[i]]=i;
        }
        for(int i=1;i<=n;i++) {
            System.out.print(p[i]+" ");
        }
    }
}
