package com.company;

import java.util.*;


public class king {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == max) {
                count++;
            }
            if ((arr[i] != max) && (count > 0)) {
                count--;
            }
            if (count == 0) {
                max = arr[i];
                count = 1;
            }
        }
        if (count > n / 2) {
            System.out.println(max);
        }
    }
}
