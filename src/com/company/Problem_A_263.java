package com.company;


import java.util.Scanner;
public class Problem_A_263 {
    //  A. Beautiful Matrix
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                int sum=sc.nextInt();
                if(sum==1)
                    System.out.println(Math.abs(j-3)+Math.abs(i-3));
            }
        }

    }
}