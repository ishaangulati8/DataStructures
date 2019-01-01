package com.company;

import java.util.*;

public class occurencestringinjava {
    public static LinkedList<String> substr(String str) {
        LinkedList<String> ll = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                ll.add(str.substring(i, j));
            }
        }
        return ll;
    }

    public static void main(String args[]) throws Exception {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        LinkedList<String> ll = new LinkedList<>(substr(c));
        System.out.println(ll);
        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i).contains(a) && ll.get(i).contains(b)) {
                System.out.println(ll.get(i));
                count++;
                System.out.println(count);
            }
        }

        System.out.println(count);


    }
}


