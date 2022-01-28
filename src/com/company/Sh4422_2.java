package com.company;

import java.util.Scanner;

public class Sh4422_2 {
//    2. N1 va N2 natural sonlari va s1 va s2 stringlar berilgan. S1ning boshidan
//    N1 ta elementi va S2 ni oxiridan N2 ta elemetidan iborat yangi satr
//    yarating.
//            Masalan: N1 = 3, N2= 4.
//    S1 = “Hello world!” S2 =”Salom dunyo”.
//    Natija: “Helunyo”.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=3;
        int n2=4;

        String s1 = "Hello World";
        String s2 = "Salom Dunyo";

        System.out.print(s1.substring(0,n1)+""+s2.substring(s2.length()-n2));


    }
}
