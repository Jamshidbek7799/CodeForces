package com.company;

public class Sh4422_3 {
//       3. C belgisi va S1 va S2 satrlari berilgan. S1 da har bir uchragan C
//         belgisidan keyin S2 ni qo’shing.
//         Masalan: C =’l’ S1= “Hello world!” S2= “WWW”
//         Natija: “HelWWWlWWWo worlWWWd!”
    public static void main(String[] args) {
        char C = 'l';
        String s1="Hello world!";
        String s2="WWW";

      char[] m =s1.toCharArray();

        for (int i = 0; i <m.length ; i++) {
            System.out.print(m[i]);
            if (m[i]=='l'){
              System.out.print(s2);
          }
        }



    }
}
