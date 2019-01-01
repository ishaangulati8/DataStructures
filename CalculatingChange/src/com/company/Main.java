package com.company;


import java.util.Map;

public class Main {
    static int counter = 2;

    public static boolean islucky(int n) {
        int nextpos = n;
        if (n < counter) {
            return true;
        }
        if (n % counter == 0) {
            return false;
        }
        counter += 1;
        nextpos = -nextpos / counter;
        return islucky(nextpos);
    }

    public static float squareroot(int n) {
        float x = n;
        float y = 1;
        double e = 0.000000000001;
        while (x - y > e) {
            x = (x + y) / 2;
            y = n / x;
        }
        return x;

    }

    public static int Count(int arr[], int M, int N) {
        if (M == 0) {
            return 1;
        }
        if (N == 0) {
            return 0;
        }
        if (M <= 0 && N >= 1) {
            return 0;
        }
        return Count(arr, M, N - 1) + Count(arr, M - arr[N - 1], N);
    }

    //public static int Count (int arr[], int M , int N,Map<>)
    public static void main(String[] args) {
        // write your code here
        int arr[] = new int[]{1, 2, 3, 4};
        // System.out.println(Count(arr,9,arr.length));
        int n = 6;
        int[] arr1 = new int[]{1, 3, 2, 4, 5, 7, 10};
        int[] memo = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            memo[i] = 1;
        }
        for (int i = 1; i < arr1.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr1[i] > arr1[j] && memo[i] < memo[j] + 1) {
                    memo[i] = memo[j] + 1;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < memo.length; i++) {
            max = Math.max(max, memo[i]);
        }
        System.out.println(max);
        System.out.println(islucky(19));
        System.out.println(squareroot(123));

    }
}

