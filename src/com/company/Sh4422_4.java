package com.company;

public class Sh4422_4 {
//     4. S1, S2, S3 satrlari berilgan. S1 satrda uchragan har S2 satr o’rniga S3
//    satr yozing.
//    Masalan: S1=”Salom hammaga. Salom Aka”. S2= “Salom” S3=”Alo”
//    Natija: “Alo hammaga, Alo Aka”.
    public static void main(String[] args) {
        String s1="Salom hammaga. Salom Aka";
        String s2="Salom";
        String s3="Alo";

        s1=s1.replaceAll(s2,s3);
        System.out.println(s1);
    }
}
