package com.company;

import java.util.Scanner;


import java.util.Stack;


public class waterarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0, max1 = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < stack.peek()) {
                while (!stack.empty()) {
                    max += stack.pop();
                }
                if (max > max1) {
                    max1 = max;
                }
                stack.push(arr[i]);
            } else {
                stack.push(arr[i]);
            }
        }
        int area = 0;
        while (!stack.empty()) {
            System.out.println(area);
            area += stack.pop();
        }
        if (max1 > area) {
            area = max1;
        }
        System.out.println(area * 2);
        String[] str = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    }
}

