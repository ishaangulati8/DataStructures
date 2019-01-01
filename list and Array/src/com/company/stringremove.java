package com.company;

import java.util.*;


public class stringremove {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                if (!map.containsKey(arr[i])) {
                    map.put(arr[i], 1);
                } else {
                    map.put(arr[i], map.get(arr[i]) + 1);
                }
            }
        }
        Stack<Character> stack = new Stack<>();
        for (Character i : map.keySet()) {
            if (map.get(i) > count) {
                if (stack.empty()) {
                    stack.push(i);
                    count = map.get(i);
                } else {
                    while (!stack.empty()) {
                        stack.pop();
                    }
                    stack.push(i);
                    count = map.get(i);
                }
            } else if (map.get(i) == count) {
                stack.push(i);
            }
        }
        LinkedList<Character> ll2 = new LinkedList<>();
        while (!stack.empty()) {
            char a = stack.pop();
            ll2.add(a);
        }
        Collections.sort(ll2);
        char b = ll2.get(ll2.size() - 1);
        String a1 = Character.toString(b);
        str = str.replace(a1, "");
        System.out.println(str);

    }
}
