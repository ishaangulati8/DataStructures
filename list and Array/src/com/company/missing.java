package com.company;

import java.util.Scanner;

public class missing {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (Math.abs(arr[i]) < n) {
                int a = Math.abs(arr[i]);
                arr[a] *= -1;
            }
        }
        int number = 0;
        boolean flag = false;
        for (int i = 1; i < n; i++) {
            if (arr[i] > 0) {
                if (arr[i] <= n) {
                    flag = true;
                    number = i;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println(number);
        } else {
            System.out.println(n);
        }


    }
}
