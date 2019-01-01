package com.company;

import java.util.*;

public class leader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int leaders[] = new int[n];
        leaders[0] = arr[n - 1];
        int max = arr[n - 1];
        int j = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                leaders[j] = max;
                j += 1;
            }
        }
        for (int i : leaders) {
            if (i != 0) {
                System.out.println(i);
            }
        }
    }
}
