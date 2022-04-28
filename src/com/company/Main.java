package com.company;


public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] m=solution.twoSum(new int[]{2, 7, 11, 15},9);
        for (int i = 0; i <m.length ; i++) {
            System.out.println(m[i]);
        }

    }
}

