package com.company;

import java.util.*;


public class characterstring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a;
        String b;
        String c = "";
        a = sc.nextLine();
        b = sc.nextLine();
        int j = 0;
        int k = 0;
        for (int i = 0; i < (a.length() + b.length()); i++) {
            if ((i % 2 == 0) && (j < a.length())) {
                char key1 = a.charAt(j);
                String key = Character.toString(key1);
                c = c.concat(key);
                j++;
            }
            if ((i % 2 == 1) && (k < b.length())) {
                char key2 = b.charAt(k);
                String key = Character.toString(key2);
                c = c.concat(key);
                k++;
            }
            if (j == a.length() && k < b.length()) {
                String l1 = b.substring(k);
                c = c.concat(l1);
                break;
            }
            if (k == b.length() && j < a.length()) {
                String l2 = a.substring(j);
                c = c.concat(l2);
                break;
            }
        }

        char arr[] = c.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
