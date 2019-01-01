package com.company;

import java.util.*;

public class majority {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : arr) {
            if (map1.containsKey(i)) {
                map1.put(i, map1.get(i) + 1);
            } else {
                map1.put(i, 1);
            }
        }
        int mid = n / 2;
        for (int i : map1.keySet()) {
            if (map1.get(i) > mid) {
                System.out.println(i);
            }
        }
    }
}
