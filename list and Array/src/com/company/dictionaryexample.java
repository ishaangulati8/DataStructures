package com.company;

import java.util.*;


public class dictionaryexample {
    public static void main(String[] args) {
        /*dict:- { “Rat”, “mat” ,”bat”, “chat”,
          “cat”, “tab”, “fab”, “batt” }*/
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("rat");
        l1.add("mat");
        l1.add("bat");
        l1.add("chat");
        l1.add("cat");
        l1.add("tab");
        l1.add("fab");
        l1.add("batt");
        System.out.println(l1);
        LinkedList<String> l2 = new LinkedList<>();
        LinkedList<String> answer = new LinkedList<>();
        char[] arr = {'t','a','b','c'};
        int len = arr.length;
        int num = (int)Math.pow(len,2);
        for (int i =0; i < num; i++) {
            String str = " ";
            for (int j = 0; j < arr.length; j++) {
                if ((i&(1<<j)) > 0) {
                    str = str.concat(Character.toString(arr[j]));
                    //System.out.println(j);
                }
            }
            l2.add(str);
        }
        //System.out.println("out of first loopr");
        for (int a = 0; a < l2.size(); a++) {
            String a1 = l2.get(a);
            if (l1.contains(a1)) {
                answer.add(a1);
            }
        }
        System.out.println(answer);
        System.out.println(l2);

    }
}
