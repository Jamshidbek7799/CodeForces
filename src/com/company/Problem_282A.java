package com.company;


import java.util.Scanner;
public class Problem_282A {
    // Bit++
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int x=0;
       String s;

        for (int i = 0; i <n ; i++) {
            s=sc.next();
            if (s.equals("++X") |
                s.equals("X++"))
            {
                x++;
            }else if (s.equals("--X") |
                      s.equals("X--"))
                x--;
        }

       System.out.println(x);

    }
}