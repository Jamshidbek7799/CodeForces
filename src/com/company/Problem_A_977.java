package com.company;

import java.util.Scanner;
public class Problem_A_977 {
    // Wrong Subtraction
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 1; i <=k ; i++) {
            if (n%10==0){
                n/=10;
            }else
                n--;
        }

        System.out.println(n);

    }
}