package com.company;

import java.util.Scanner;
public class Problem_A_785 {
    // Anton and Polyhedrons
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s;
        int cnt=0;
        for (int i = 1; i <= n; i++) {
            s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(0) == 'T') {
                    cnt += 4;
                    break;
                } else if (s.charAt(0) == 'C') {
                    cnt += 6;
                    break;
                } else if (s.charAt(0) == 'O') {
                    cnt += 8;
                    break;
                } else if (s.charAt(0) == 'D') {
                    cnt += 12;
                    break;
                } else if (s.charAt(0) == 'I') {
                    cnt += 20;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
