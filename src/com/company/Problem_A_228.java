package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Problem_A_228 {
    //   Is your horseshoe on the other hoof?
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<4;i++)
            set.add(sc.nextInt());
        System.out.println(4-set.size());
        sc.close();

    }
}