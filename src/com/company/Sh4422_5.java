package com.company;

public class Sh4422_5 {
//    5 Probel bilan ajratilgan satr berilgan, shu satrdagi so’zlar sonini
//    aniqlovchi dastur tuzing.
//            Masalan: “Hammaga salom.”
//    Natija: 2
    public static void main(String[] args) {
       String s="Hammaga salom";

       char m[]=s.toCharArray();
       int cnt=0;
        for (int i = 0; i <m.length; i++) {
            if (m[i]==' ')
                cnt+=2;
        }
        System.out.println(cnt);
    }
}
