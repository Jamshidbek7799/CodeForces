package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Sh4422_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        s1=s1.replaceAll(s2, "_GITA_");
        System.out.println(s1);
    }
}
