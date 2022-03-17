package com.company;

import java.util.Scanner;

public class Problem_A_69 {
    // Young Physicist
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X=0; int Y=0; int Z=0;
        for (int i = 0; i <n ; i++) {
            X+=sc.nextInt();
            Y+=sc.nextInt();
            Z+=sc.nextInt();
        }
        System.out.println(X==0 && Y==0 && Z==0 ?"YES":"NO");
    }
}
