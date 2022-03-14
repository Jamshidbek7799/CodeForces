package com.company;

import java.util.Scanner;

public class Problem_118A {
    //  String Task
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next() //   aBAcAba
                .toLowerCase()  // abacaba
                .replaceAll("[aoyeui]","") // { b c b }
                .replaceAll("",".");     //  {.b.c.b.}
        System.out.println(s.substring(0,s.length()-1));

//================================== next for example.
        System.out.println(new Scanner(System.in).next()
                .toLowerCase()
                .replaceAll("[aeiouy]","")
                .replaceAll(".", ".$0"));

    }
}
