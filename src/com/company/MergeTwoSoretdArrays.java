package com.company;

import java.util.Scanner;

public class MergeTwoSoretdArrays {

    protected void input(int[] arr) {
        System.out.println("Input");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
/*\
* WORKS ONLY WHEN BOTH THE ARRAYS ARE SORTED IN ASCENDING OR DESCENDING ORDER*/
    protected int[] mergeTwo(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        if (length1 == 0 || length2 == 0) {
            return new int[]{};
        }
        int[] result = new int[length1 + length2];
        int n1 = 0;
        int n2 = 0;
        int k = 0;
        while ((n1 < length1 && n2 < length1) && k < length1 + length2) {
            if (arr1[n1] <= arr2[n2]) {
                result[k++] = arr1[n1++];
            } else {
                result[k++] = arr2[n2++];
            }
        }
        if (n1 == length1 && n2 < length2) {
            while (n2 < length2) {
                result[k++] = arr2[n2++];
            }
        }
        if (n2 == length2 && n1 < length1) {
            while (n1 < length1) {
                result[k++] = arr1[n1++];
            }
        }

        return result;

    }
}
