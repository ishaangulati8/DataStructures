package com.company;

import java.util.*;


public class sumcontains3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            map.put(arr[i], i);
        }
        int count = 0;
        System.out.println("enter the key");
        int key = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                sum = key - arr[i] - arr[j];
                if (map.containsKey(sum)) {
                    if ((map.get(sum) != i) && (map.get(sum) != j)) {
                        int k = 0;
                        if (map.containsKey(sum)) {
                            k = sum;
                        }
                        if (arr[i] >= arr[j] && arr[i] >= sum) {
                            System.out.print(arr[i]);
                            System.out.print(arr[j]);
                            System.out.println(sum);
                            System.out.println();
                        }
                    }
                }
            }
        }


    }
}
