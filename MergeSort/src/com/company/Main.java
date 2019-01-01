package com.company;

public class Main {
    public static void print(int arr[], int s, int e) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public void Merge(int[] arr, int s, int e) {
        int[] temp = new int[arr.length];
        int i = s;
        int mid = (s + e) / 2;
        int j = mid + 1;
        int k = s;
        while (i <= mid && j <= e) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                k++;
                j++;
            }
        }
        while (i <= mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }
        while (j <= e) {
            temp[k] = arr[j];
            k++;
            j++;
        }
        for (i = s; i <= e; i++) {
            arr[i] = temp[i];
        }
    }

    public void Mergesort(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = (s + e) / 2;
        Mergesort(arr, s, mid);
        Mergesort(arr, mid + 1, e);
        Merge(arr, s, e);
    }


    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 1, 2, 9, 0, 3, 1,-1,-9};
        Main ob = new Main();
        ob.Mergesort(arr, 0, arr.length - 1);
        print(arr, 0, arr.length - 1);


    }
}
