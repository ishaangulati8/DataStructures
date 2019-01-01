package com.company;

import java.util.*;

public class second_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int first, second;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        first = arr[0];
        second = 0;
        for (int i : arr) {
            if (i > first) {
                second = first;
                first = i;
            } else if ((i < first) && (i > second)) {
                second = i;
            }
        }
        System.out.println("first : " + first);
        System.out.println("second " + second);

    }
}
