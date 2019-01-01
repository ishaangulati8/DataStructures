package com.company;

import java.sql.SQLOutput;
import java.util.*;


public class stringmatching {
    public static void main(String args[]) {
        int count = 1;
        int max = 0;
        int arr[] = {2, 3, 4, 1, 5, 7};
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            if (arr[j] > arr[i] && arr[i] != 0) {
                count++;
            } else {
                max = count;
                count = 1;
            }
        }
        count = 3;
        max = 3;
        System.out.println(max > count ? max : count);
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        String T = "xywrrmu#p";
        String S = "xywrrmp";
        for (int i = 0; i < S.length(); i++) {
            if (!s1.empty() && S.charAt(i) == '#') {
                s1.pop();
            } else {
                if (S.charAt(i) != '#') {
                    s1.push(S.charAt(i));
                }
            }
        }
        for (int i = 0; i < T.length(); i++) {
            if (!s2.empty() && T.charAt(i) == '#') {
                s2.pop();
            } else {
                if (T.charAt(i) != '#') {
                    s2.push(T.charAt(i));
                }
            }
        }
        System.out.println("s1" + s1);
        System.out.println("s2" + s2);
        if (String.valueOf(s1).equals(String.valueOf(s2))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        String asddf = "asdfgh";
        System.out.println("\'\'");
        System.out.println("\"\"");


    }
}
