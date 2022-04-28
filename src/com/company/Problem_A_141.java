package com.company;

import java.util.Arrays;
import java.util.Scanner;
public class Problem_A_141 {
    // Amusing Joke
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr=(sc.next()+sc.next()).toCharArray();
        char[] arr2=sc.next().toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr, arr2)?"YES":"NO");
    }
}
