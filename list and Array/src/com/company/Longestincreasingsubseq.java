package com.company;

import java.util.*;


public class Longestincreasingsubseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int[] arr = new int[n];
        int[] memo = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            memo[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && memo[i] < memo[j] + 1) {
                    memo[i] = memo[j] + 1;
                }
            }
//            if (memo[i] > max) {
//                max = memo[i];
//            }
        }
        for (int i = 0; i < n; i++) {
            if (memo[i] > max) {
                max = memo[i];
            }
        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(memo[i]);
//        }
        System.out.println(max);

    }

}
