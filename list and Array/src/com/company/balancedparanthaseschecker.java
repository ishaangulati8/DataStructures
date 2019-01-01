package com.company;

import java.math.BigInteger;
import java.util.Stack;
import java.util.Scanner;

public class balancedparanthaseschecker {
    public static boolean isbalanced(String s) {
        int count = 0;
        Stack<Integer> track = new Stack<>();
        Stack<Character> stack = new Stack<>();
        if (s == null || s.length() == 0) {
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            if (stack.empty()) {
                if (s.charAt(i) == '(') {
                    stack.push(s.charAt(i));
                    count += 1;
                    track.push(count);
                } else {
                    return false;
                }
            } else if (!stack.empty() && stack.peek() == '(' && s.charAt(i) == '(') {
                stack.push(s.charAt(i));
                count += 1;
                track.push(count);
            } else if (!stack.empty() && stack.peek() == '(' && s.charAt(i) == ')') {
                stack.pop();
                int a = track.pop();
                System.out.print(a + "" + a);

            }
        }
        char arr[] = {'a','s'};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == '1' ) {

            }
        }
        if (stack.empty()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean balance = isbalanced(s);
        System.out.println();
        System.out.println(balance);
    }
}
