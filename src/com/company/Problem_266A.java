package com.company;


import java.util.Scanner;
public class Problem_266A {
    // Stones on the Table
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int c=0;
        for(int i=1;i<n;i++)
            if(s.charAt(i-1)==s.charAt(i))
                c++;
        System.out.println(c);

    }
}