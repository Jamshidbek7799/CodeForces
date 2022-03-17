package com.company;

import java.util.Scanner;
public class Problem_B_266 {
    // Queue at the School
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String s=sc.next();
        while (t-- > 0){
            s=s.replaceAll("BG", "GB");
        }
        System.out.print(s+"");



        


    }
}