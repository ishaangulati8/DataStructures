package com.company;

import java.util.*;


public class sumofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        LinkedList<Integer> q = new LinkedList<>();
        q.add(arr[0]);
        System.out.println("number");
        int key = sc.nextInt();
        int sum = arr[0];
        int count = 0;
        boolean flag = false;
        for (int i = 1; i < n; i++) {
            flag = false;
            if (sum < key) {
                sum += arr[i];
                flag = false;
                q.addLast(arr[i]);
            }
            if (sum > key) {
                flag = false;
                sum = sum - q.removeFirst();
            }
            if (sum == key) {
                flag = true;
                count++;
                sum = sum - q.removeFirst();
            }

        }
        if (flag) {
            System.out.print(count);

        } else {
            System.out.println("not possible");

        }
        System.out.println(count);
        System.out.println("=====================");
        System.out.println(065);
    }
}
