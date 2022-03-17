package com.company;


import java.util.Scanner;

public class Problem_A_231 {
    // Team
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z, cnt=0, n = sc.nextInt();

        for (int i = 0; i <n ; i++) {
            x=sc.nextInt();
            y=sc.nextInt();
            z=sc.nextInt();

            if (x+y+z>1)
                cnt++;
        }
        System.out.println(cnt);
    }
}