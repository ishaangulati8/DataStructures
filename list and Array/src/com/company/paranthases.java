package com.company;

import java.util.HashMap;
import java.util.Stack;
import java.util.Scanner;

public class paranthases {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String string = sc.nextLine();
        char a[] = string.toCharArray();
        Stack<Integer> track = new Stack<>();
        stack.push(a[1]);
        int count = 1;
        track.push(count);
        for (int i = 2; i < string.length() - 1; i++) {
            if (stack.empty()) {
                if (a[i] == '[') {
                stack.push(a[i]);
                count+=1;
                track.push(count);
                } else {
                    stack.push(a[i]) ;
                }

            } else if ((a[i] == '[') && (stack.peek() == '[')) {
                stack.push(a[i]);
                count +=1;
                track.push(count);
            } else if ((a[i] == '[') && (stack.peek() == ']')) {
                stack.pop();
                //Integer pa = track.pop();
               // System.out.println(track.pop());
            } else if ((a[i] == ']') && (stack.peek() == ']')) {
                stack.push(a[i]);
            } else if ((a[i] == ']') && (stack.peek() == '[')) {
                stack.pop();
            }
        }
        if (stack.empty()) {
            System.out.println("balanced");
        } else {
            System.out.println("not balanced");
            System.out.println(stack);
        }
        System.out.println(track);
    }
}
