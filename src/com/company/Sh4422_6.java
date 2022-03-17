package com.company;

import java.util.Scanner;
public class Sh4422_6 {
//        6 Probel bilan ajratilgan satr berilgan. Satrdagi eng qisqa so’z uzunligini
//              aniqlovchi dastur tuzing.
//              Masalan: “Hello world!”
//              Natija: 5
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll("[!@#$%^,.<>&*()_:|/?{}]","");
        for (int i = 0; i <s.length() ; i++) {

        }



    }
}
