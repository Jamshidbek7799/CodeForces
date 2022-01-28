package com.company;


import java.util.Scanner;
public class Problem_71A {
    // Way too  Long Words
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s;

        for (int i = 0; i <n ; i++) {
            s=sc.next();
            int sum = s.length();
            System.out.println((sum>10) ? s.charAt(0)+""+(sum-2)+""+s.charAt(sum-1):s);
        }

    }
}
