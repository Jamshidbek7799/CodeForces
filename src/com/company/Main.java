package com.company;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next() //   aBAcAba
                .toLowerCase()  // abacaba
                .replaceAll("[aoyeui]","") // { b c b }
                .replaceAll("",".");     //  {.b.c.b.}
        System.out.println(s.substring(0,s.length()-1));
    }
}
