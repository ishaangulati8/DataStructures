package com.company;

import java.util.*;


public class guess {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            hashSet.add(arr[i]);
        }
        System.out.println("enter key :");
        int k = sc.nextInt();
        int j = 0;
        for (int i = 0; i < n; i++) {
            j = k - arr[i];
            if (hashSet.contains(j)) {
                System.out.println(arr[i] + "," + j);
            }
        }

    }
}
