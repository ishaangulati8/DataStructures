package com.company;


import java.util.Arrays;

public class Main {
    public static void Using_Sort(int[] arr1) {
        Arrays.sort(arr1);
        int i = 0, j = 1;
        while (j < arr1.length) {
            int temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;
            i += 2;
            j += 2;
        }
        for (int k : arr1) {
            System.out.print(k + " ");
        }
    }

    public static void UsingSortlast(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            if (i > 0 && arr[i - 1] > arr[i]) {
                int temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
            }


            if (i < arr.length - 1 && arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

        }
    }

    public static void main(String[] args) {
        // write your code here
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        Using_Sort(arr);
        int[] arr1 = new int[]{4, 1, 2, 3, 6, 3, 6, 8, 4, 0};
        UsingSortlast(arr1);
        System.out.println();
        for (int i : arr1) {
            System.out.print(i + " ");

        }
        System.out.println('A' + 1);

    }
}
