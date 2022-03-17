package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_A_160 {
    //   Twins
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(), a[]=new int[n], t=0,h=0,c=0,i=0;

        for(;i<n;)
            t+=a[i++]=s.nextInt();

        for(Arrays.sort(a); h<=t/2 ;c++)
            h+=a[--n];

        System.out.print(c);
    }
}
