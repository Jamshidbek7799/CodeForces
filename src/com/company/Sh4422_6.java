package com.company;

import java.util.Scanner;
public class Sh4422_6 {
//        6 Probel bilan ajratilgan satr berilgan. Satrdagi eng qisqa so’z uzunligini
//              aniqlovchi dastur tuzing.
//              Masalan: “Hello world!”
//              Natija: 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll("[!@#$%^,.<>&*()_:|/?{}']", "");

        String[] a = s.split(" ");
        System.out.println(min(a));
    }
    //  return Word minimum size
        public static int min(String []x){
        int k = x[0].length();
        for (String element : x){
            if (element.length() < k){
                k=element.length();
            }
        }
        return k;
        }















}
