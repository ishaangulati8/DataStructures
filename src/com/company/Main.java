package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MergeTwoSoretdArrays merge = new MergeTwoSoretdArrays();
        int[] arr1 = new int[] {1,2,4,7};
        int[] arr2 = new int[] {0,3,5,6};
        for (int i : merge.mergeTwo(arr1, arr2)) {
            System.out.println(i);
        }
        System.out.println("N arrays");
        MergeNSortedArrays mergeN = new MergeNSortedArrays();
        int[][] arr = new int[][] {{1,2,3}, {4,5,6,6}, {8,9}};
        for (int i : mergeN.merge(arr)) {
            System.out.println(i);
        }
    }
}
