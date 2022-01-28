package com.company;


import java.util.Scanner;
public class Problem_791A {
    // Bear and Big Brother
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int cnt=0;
        while (true){
            a=a*3;
            b=b*2;
            cnt++;
            if (a>b){
                System.out.println(cnt);
                break;
            }
        }



    }
}