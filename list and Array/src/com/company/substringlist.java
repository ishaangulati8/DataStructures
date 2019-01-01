package com.company;

import java.util.*;


public class substringlist {
    public static void main(String args[]) {
        LinkedList<String> l = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        l.add("");
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                l.add(str.substring(i, j));
                count++;
            }
        }
        char arr[] = str.toCharArray();
        double n = arr.length;
        int a = (int)Math.pow(2, n);
        LinkedList<String> subseq = new LinkedList<>();
        for (int i = 0; i < a; i++) {
            String t = "";
            for (int j = 0; j < arr.length; i++) {
                if ((i & (1 << j)) > 0) {
                    t = t.concat(Character.toString(arr[j]));
                }
            }
            subseq.add(t);
        }
        System.out.println("Subseq" + subseq);
//
//        System.out.println(l);
//        System.out.println(count);
//        String b = "abcabcb";
//        b = b.replace("a", "");
//        b = b.replace("bc", "");
//        System.out.println(b);
    }
}
